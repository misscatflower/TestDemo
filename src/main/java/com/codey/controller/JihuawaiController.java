package com.codey.controller;

import com.codey.util.PrintSH;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import com.codey.util.GETTime;

@Slf4j
@RestController
@RequestMapping("/jihuawai")
public class JihuawaiController {
    GETTime getTime = new GETTime();

    @RequestMapping(value = "jihuawai1", method = RequestMethod.GET)
    public String addTest1(String userName, String password) {
        log.info("--------------------方法进入");
        PrintSH printSH = new PrintSH();
        printSH.printLog1();
        printSH.printLog1("打印的字符串printLog1");
        if (userName.isEmpty()) {
            getTime.getTime(1);
            return "登录失败，姓名不能为空";
        }
        // 方法中的注释
        if ("888".equals(password)) {
            getTime.getTime(2);
            // 分支注释
            return "888登录成功";
        } else if ("777".equals(password)) {
            getTime.getTime(3);
            log.info("登录密码777");
            return "登录也成功";
        } else {
            getTime.getTime(0);
            return "登录失败";
        }
    }

    @RequestMapping(value = "jihuawai2", method = RequestMethod.GET)
    public String addTest2(String userName, String password) {
        log.info("--------------------方法进入");
        PrintSH printSH = new PrintSH();
        printSH.printLog1();
        printSH.printLog1("打印的字符串printLog1");
        if (userName.isEmpty()) {
            getTime.getTime(1);
            return "登录失败，姓名不能为空";
        }
        // 方法中的注释
        if ("888".equals(password)) {
            getTime.getTime(2);
            // 分支注释
            return "888登录成功";
        } else if ("777".equals(password)) {
            getTime.getTime(3);
            log.info("分支有效代码修改");
            return "登录也成功";
        } else if ("999".equals(password)) {
            getTime.getTime(3);
            return "登录成功999";
        } else {
            getTime.getTime(0);
            return "登录失败";
        }
    }

    @RequestMapping(value = "jihuawai3", method = RequestMethod.GET)
    public String getTest1(String userName, String password) {
        log.info("--------------------方法进入");
        PrintSH printSH = new PrintSH();
        printSH.printLog1();
        printSH.printLog1("打印的字符串printLog1");
        if (userName.isEmpty()) {
            getTime.getTime(1);
            return "登录失败，姓名不能为空";
        }
        // 方法中的注释
        if ("888".equals(password)) {
            getTime.getTime(2);
            // 分支注释
            return "888登录成功";
        } else if ("777".equals(password)) {
            getTime.getTime(3);
            System.out.print("分支有效代码修改");
            return "登录也成功";
        } else {
            getTime.getTime(0);
            return "登录失败";
        }
    }

    @RequestMapping(value = "jihuawai4", method = RequestMethod.GET)
    public String getTest2(String userName, String password) {
        log.info("--------------------方法进入");
        PrintSH printSH = new PrintSH();
        printSH.printLog1();
        printSH.printLog1("修改的方法");
        System.out.println("修改了，测试增量覆盖率");
        if (userName.isEmpty()) {
            getTime.getTime(1);
            return "登录失败，姓名不能为空";
        }
        if (password.isEmpty()) {
            getTime.getTime(1);
            return "登录失败，密码不能为空";
        }
        // 方法中的注释
        if ("888".equals(password)) {
            getTime.getTime(2);
            // 分支注释
            return "888登录成功";
        } else if ("777".equals(password)) {
            getTime.getTime(3);
            return "登录也成功";
        } else if ("999".equals(password)) {
            getTime.getTime(3);
            return "登录也成功";
        } else {
            getTime.getTime(0);
            return "登录失败";
        }
    }

    @RequestMapping(value = "jihuawai5", method = RequestMethod.GET)
    public String getTest5(String userName, String password) {
        log.info("--------------------方法进入");
        PrintSH printSH = new PrintSH();
        printSH.printLog1();
        printSH.printLog1("修改的方法");
        System.out.println("修改了，测试增量覆盖率");
        if (userName.isEmpty()) {
            getTime.getTime(1);
            return "登录失败，姓名不能为空";
        }
        // 方法中的注释
        if ("888".equals(password)) {
            getTime.getTime(2);
            printSH.printLog1("登录密码为888");
            // 分支注释
            return "888登录成功";
        } else if ("777".equals(password)) {
            getTime.getTime(3);
            printSH.printLog1("登录密码为777");
            return "登录也成功";
        } else if ("999".equals(password)) {
            getTime.getTime(3);
            return "登录也成功";
        } else {
            getTime.getTime(0);
            return "登录失败";
        }
    }

    @RequestMapping(value = "jihuawai6", method = RequestMethod.GET)
    public String getTest6(String userName, String password) {
        log.info("--------------------方法进入");
        PrintSH printSH = new PrintSH();
        printSH.printLog1();
        printSH.printLog1("ceshi");
        System.out.println("ceshi");
        if (userName.isEmpty()) {
            getTime.getTime(1);
            return "空ceshi";
        }
        // 方法中的注释
        if ("888".equals(password)) {
            getTime.getTime(2);
            // 分支注释
            return "888ceshi";
        } else if ("777".equals(password)) {
            getTime.getTime(3);
            return "777ceshi";
        } else if ("999".equals(password)) {
            getTime.getTime(3);
            return "999ceshi";
        } else if  ("1".equals(password)) {
            getTime.getTime(0);
            return "密码为1";
        } else {
            return "登陆失败";
        }
    }

    @RequestMapping(value = "jihuawai7", method = RequestMethod.GET)
    public String getTest7(String userName, String password) {
        log.info("--------------------jihuawai7方法进入");
        PrintSH printSH = new PrintSH();
        printSH.printLog1();
        printSH.printLog1("ceshi");
        System.out.println("ceshi");
        if (userName.isEmpty() || password.isEmpty()) {
            getTime.getTime(1);
            return "用户名或密码不能为空";
        }
        // 方法中的注释
        if ("888".equals(password)) {
            getTime.getTime(2);
            // 分支注释
            return "888ceshi";
        } else if ("777".equals(password)) {
            getTime.getTime(3);
            return "777ceshi";
        } else if ("999".equals(password)) {
            getTime.getTime(3);
            return "999ceshi";
        } else if  ("1".equals(password)) {
            getTime.getTime(0);
            return "密码为1";
        } else {
            return "登陆失败";
        }
    }

}
