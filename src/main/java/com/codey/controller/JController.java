package com.codey.controller;

import com.codey.util.PrintSH;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import com.codey.util.GETTime;

@Slf4j
@RestController
@RequestMapping("/jihuawai2")
public class JController {
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
        if ("1".equals(password)) {
            getTime.getTime(2);
            // 分支注释
            return "只有1才能登录成功";
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
        if ("2".equals(password)) {
            getTime.getTime(2);
            // 分支注释
            return "只有2才能登录成功";
        } else if ("777".equals(password)) {
            getTime.getTime(3);
            return "传2传2才能成功";
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
        if ("3".equals(password)) {
            getTime.getTime(2);
            // 分支注释
            return "3登录成功";
        } else if ("777".equals(password)) {
            getTime.getTime(3);
            System.out.print("分支有效代码修改");
            return "传3";
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

    @RequestMapping(value = "ji1", method = RequestMethod.GET)
    public String jiTest1(String userName, String password) {
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

    @RequestMapping(value = "ji2", method = RequestMethod.GET)
    public String jiTest2(String userName, String password) {
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


    @RequestMapping(value = "/test/jihuawai3", method = RequestMethod.GET)
    public String getTest7(String userName, String password) {
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

    @RequestMapping(value = "/test1/jihuawai3", method = RequestMethod.GET)
    public String getTest8(String userName, String password) {
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

    @RequestMapping(value = "/get111", method = RequestMethod.GET)
    public String getTest111(String userName, String password) {
        log.info("--------------------方法进入");
        PrintSH printSH = new PrintSH();
        printSH.printLog1();
        printSH.printLog1("打印的字符串printLog1");
        if (userName.isEmpty()) {
            getTime.getTime(1);
            return "登录失败，姓名不能为空";
        }
        // 方法中的注释
        if ("111".equals(password)) {
            getTime.getTime(2);
            // 分支注释
            return "111登录成功";
        } else {
            getTime.getTime(0);
            return "登录失败";
        }
    }


    @RequestMapping(value = "/get222", method = RequestMethod.GET)
    public String getTest222(String userName, String password) {
        log.info("--------------------方法进入");
        PrintSH printSH = new PrintSH();
        printSH.printLog1();
        printSH.printLog1("打印的字符串printLog1");
        if (userName.isEmpty()) {
            getTime.getTime(1);
            return "登录失败，姓名不能为空";
        }
        // 方法中的注释
        if ("222".equals(password)) {
            getTime.getTime(2);
            // 分支注释
            return "222登录成功";
        } else {
            getTime.getTime(0);
            return "登录失败";
        }
    }

}
