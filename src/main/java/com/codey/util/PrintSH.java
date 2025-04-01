package com.codey.util;

import java.util.EmptyStackException;

public class PrintSH {

    public String printLog1(){
        String logs = "打印日志";
        System.out.println(logs);
        return logs;
    }

    public void printLog1(String log2){
        System.out.println(log2);
    }

    public int printLog(String num){
        int result;
        if(num.isEmpty()){
            // 打印的内容为空
            printLog1();
            result = 0;
        } else {
            // 打印的内容不为空，只改注释
            printLog1(num);
            result =1;
        }
        return result;
    }

    public void testContinue(int num){
        for (int i = 0; i < 4; i++) {
            if(num<i){
                System.out.println("num比i小");
                continue;
            }
            System.out.println("num比i大");
        }
    }

    public void printLogPlus(String log2,Integer log3, String log4){
        System.out.println(log2);
    }

    public void throw_exception1(Integer num){
        if(num.equals(1)){
            // 抛出异常1
            int result = 10 / 0; // 尝试除以零
            System.out.println(result);
        } else if(num.equals(2)){
            // 抛出异常2
            Object obj = new Integer(100);
            String str = (String) obj; // 尝试将 Integer 强制转换为 String
            System.out.println(str);
        } else if(num.equals(3)){
            String numberStr = "abc";
            int number = Integer.parseInt(numberStr); // 尝试将非数字字符串解析为整数
            System.out.println(number);
        } else if(num.equals(4)){
            // 抛出异常2
            Object obj = new Integer(100);
            String str = (String) obj; // 尝试将 Integer 强制转换为 String
            System.out.println(str);
        } else{
            System.out.println("不抛异常");
        }

    }

    public void throw_exception2(String a){
        String s = null;
        System.out.println(s.length());
    }

    public void throw_exception3(String a){
        // 创建一个数组
        int[] numbers = new int[5];
        // 尝试访问数组的第6个元素（索引越界）
        System.out.println(numbers[5]);
    }
}
