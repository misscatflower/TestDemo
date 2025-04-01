package  com.codey.service;

import org.springframework.stereotype.Service ;
import java.lang.reflect.Method;
   
@Service
public  class ProjectManageService {
    public String queryClassName(Class type, String methodName){
        String className = null;
        Method[] methods = type.getDeclaredMethods();//获取当前类实现的方法（getMethods()是获取所有方法，包括抽象）
        for (Method method:methods) {
            if (methodName.equals(method.getName())) {
                className=type.getName();
            }
        }
        if (className == null) {
            Class superClass = type.getSuperclass();
            if (superClass.getName().contains("java.lang.Object")) {
                return "null";
            } else {
                className = queryClassName(superClass, methodName);
            }
        }
        return className;
    }
}