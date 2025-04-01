#!/bin/bash
SYS_ENV=$1
VERSION_TAG=$2
VERSION_NAME=$3
PULL_TYPY=$4
AGENT_TYPE="sandbox"
SERVER_NAME="YSXM"
BRANCH_NO="C01"
JAR_NAME="demo-jacoco-1.0"
SERVER_NO="none"
echo "开始拼接精准测试流水线接口参数"

# 构建正确的 JSON 格式的 POST 数据
POST_DATA=$(cat <<EOF
{
 "agentType": "$AGENT_TYPE",
 "sysEnv": "$SYS_ENV",
 "serverName": "$SERVER_NAME",
 "versionTag": "$VERSION_TAG",
 "versionName": "$VERSION_NAME",
 "branchNo": "$BRANCH_NO",
 "serverNo": "$SERVER_NO",
 "pullType": "$PULL_TYPY"
}
EOF
)

echo "开始调用精准测试流水线创建版本接口"
echo "${POST_DATA}"

# API_URL="http://10.22.193.40:8085/api/pipelin/autoCreateVersion"
API_URL="http://10.22.193.40:9000/api/pipelin/autoCreateVersion"

# 使用curl发送POST请求
curl -X POST $API_URL \
     -H "Content-Type: application/json" \
     -d "${POST_DATA}"

echo "开始部署testDemo！"
#部署目录
basedir="/home/testDemo"
#（2）临时目录,项目组修改
tmpdir="/tmp/testDemo"

# 停止原有tomcat服务
pp=`ps -ef | grep $JAR_NAME | grep .jar | grep -v grep | awk '{print $2}'`;
for i in $pp
do
  echo "Killing the $1 process[$i]"
  kill -9 $i
  echo "Success killed the $1 process[$i]"
done

if [ -f $tmpdir/$JAR_NAME.jar ];then
  # 谨慎删除原有目录，确保所有文件不需继承和保存；并创建目录
  rm -rf $basedir/$JAR_NAME.jar
  echo "开始拷贝jar包！"
  # 拷贝jar包
  cp $tmpdir/$JAR_NAME.jar $basedir/$JAR_NAME.jar
else
  echo "Maybe restarting…………………………………………"
fi

nohup java -javaagent:/home/testDemo/sandbox/lib/sandbox-agent.jar=confPath=/home/testDemo/sandbox/sandbox-module/config.properties\;env=${SYS_ENV}\;server_name=${SERVER_NAME} -jar $basedir/$JAR_NAME.jar >/dev/null 2>&1 &

echo "部署testDemo完成----------------"