package com.codey.controller;

import com.codey.domain.User111;
import com.codey.util.JasyptEncryptorUtils;
import com.codey.util.PrintSH;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.codey.util.GETTime;

@Slf4j
@RestController
@RequestMapping("/jacoco")
public class TestController {
    GETTime getTime = new GETTime();


    @RequestMapping(value = "addTest1", method = RequestMethod.GET)
    public String addTest1(String userName, String password) {
        log.info("--------------------方法进入test");
        String decode = JasyptEncryptorUtils.decode("X230uqpJhWwCUTWawUK/VUCLrSh0kz+X");
        User111 user111 = new User111();
        user111.setUsername(decode);
        user111.setPassword("888");
        PrintSH printSH = new PrintSH();
        printSH.printLog1();
        printSH.printLog1("修改addTest1");
        printSH.printLogPlus("111111", printSH.printLog("10"), user111.getUsername());
        JasyptEncryptorUtils.encode("123456MMYYSS");

        if (null != userName && userName.isEmpty()) {
            getTime.getTime(1);
            printSH.printLog1("修改起始行2025-03-21 11：48");
            return "姓名为空";
        }
        if (null != password && password.isEmpty()) {
            getTime.getTime(1);
            return "密码为空";
        }
        // 方法中的注释
        if ("888".equals(password)) {
            getTime.getTime(2);
            // 分支注释
            return "成功，密码888";
        } else if ("777".equals(password)) {
            getTime.getTime(3);
            log.info("密码777");
            return "成功，密码777";

        } else if ("111".equals(password)) {
            getTime.getTime(3);
            log.info("密码111");
            return "密码111成功";
        } else if ("222".equals(password)) {
            getTime.getTime(3);
            getTime.getTime(2);
            return "密码222成功";
        } else {
            getTime.getTime(0);
            return "登录失败，密码" + password;
        }
    }

    @RequestMapping(value = "addTest2", method = RequestMethod.GET)
    public String addTest2(String userName, String password) {
        log.info("--------------------方法进入");
        PrintSH printSH = new PrintSH();
        printSH.printLog1();
        printSH.printLog1("打印的字符串printLog1");
        JasyptEncryptorUtils.encode("123456MMYYSS");
        if (null != userName && userName.isEmpty()) {
            getTime.getTime(1);
            return "登录失败，姓名不能为空";
        }
        // 方法中的注释
        if ("888".equals(password)) {
            getTime.getTime(2);
            // 分支注释
            return "成功，密码888";
        } else if ("777".equals(password)) {
            getTime.getTime(3);
            log.info("分支有效代码修改");
            return "成功，密码777";
        } else if ("3".equals(password)) {
            getTime.getTime(3);
            log.info("2025-03-19 14:32,增加一个分支");
            return "成功，密码777";
        } else if (null != password && "123".equals(password)) {
            getTime.getTime(3);
            log.info("111分支有效代码修改test");
            return "成功，密码123";
        } else if (null != password && "222".equals(password)) {
            getTime.getTime(3);
            log.info("222分支有效代码修改test");
            return "成功，密码222";
        } else if (null != password && "333".equals(password)) {
            getTime.getTime(3);
            log.info("333分支有效代码修改test");
            return "成功，密码333";
        } else {
            getTime.getTime(0);
            return "登录失败";
        }
    }

    @RequestMapping(value = "addTest3", method = RequestMethod.GET)
    public String addTest3(String userName, String password) {
        log.info("--------------------方法进入");
        PrintSH printSH = new PrintSH();
        printSH.printLog1();
        if (userName.isEmpty()) {
            getTime.getTime(1);
            return "登录失败，姓名不能为空";
        }
        // 方法中的注释
        if ("888".equals(password)) {
            getTime.getTime(2);
            // 分支注释
            return "成功，密码888";
        } else if ("777".equals(password)) {
            getTime.getTime(3);
            System.out.print("分支有效代码修改");
            return "登录也成功";
        } else if ("111".equals(password)) {
            getTime.getTime(3);
            System.out.print("2025-03-19 14:32,修改分支条件");
            return "成功，密码111";
        } else if ("222".equals(password)) {
            getTime.getTime(3);
            System.out.print("2025-03-19 14:32,修改分支条件");
            return "成功，密码222";
        } else {
            getTime.getTime(0);
            return "登录失败";
        }
    }

    @RequestMapping(value = "addTest4", method = RequestMethod.GET)
    public String addTest4(String userName, String password) {
        log.info("--------------------方法进入");
        PrintSH printSH = new PrintSH();
        printSH.printLog1("打印的字符串printLog1");
        printSH.printLog1();
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
        } else if (null != password && "111".equals(password)) {
            getTime.getTime(3);
            System.out.print("111分支有效代码修改test");
            return "111成功";
        } else {
            getTime.getTime(0);
            return "登录失败";
        }
    }

    @RequestMapping(value = "addTest5", method = RequestMethod.GET)
    public String addTest5(String userName, String password) {
        log.info("--------------------方法进入");
        PrintSH printSH = new PrintSH();
        printSH.printLog1();
        JasyptEncryptorUtils.encode("123456MMYYSS");
        if (userName.isEmpty()) {
            getTime.getTime(1);
            return "addTest5登录失败，姓名不能为空";
        }
        // 方法中的注释
        if ("888".equals(password)) {
            getTime.getTime(2);
            // 分支注释
            return "addTest5登录成功";
        } else if ("777".equals(password)) {
            getTime.getTime(3);
            System.out.print("分支有效代码修改");
            return "登录也成功";
        } else {
            getTime.getTime(0);
            return "登录失败";
        }
    }


    @RequestMapping(value = "getTest1", method = RequestMethod.GET)
    public String getTest1(String userName, String password) {
        log.info("--------------------getTest1方法进入");
        PrintSH printSH = new PrintSH();
        printSH.printLog1();
        printSH.printLog1("打印的字符串printLog1");
        if (userName.isEmpty()) {
            getTime.getTime(1);
            return "姓名为空";
        }
        // 方法中的注释
        if ("888".equals(password)) {
            getTime.getTime(2);
            // 分支注释
            return "密码888登录成功";
        } else if ("999".equals(password)) {
            getTime.getTime(2);
            System.out.print("修改分支判断条件");
            System.out.print("分支有效代码修改");
            return "密码777登录成功";
        } else {
            if ("666".equals(password)) {
                System.out.print("passWord为666");
            }
            getTime.getTime(0);
            return "登录失败，密码" + password;
        }
    }

    @RequestMapping(value = "getTest2", method = RequestMethod.GET)
    public String getTest2(String userName, String password) {
        log.info("--------------------getTest2方法进入");
        PrintSH printSH = new PrintSH();
        printSH.printLog1();
        printSH.printLog1("getTest2修改的方法");
        System.out.println("修改了，测试增量覆盖率");
        if (userName.isEmpty()) {
            getTime.getTime(1);
            return "登录失败，姓名为空";
        }
        // 方法中的注释
        if ("888".equals(password)) {
            getTime.getTime(2);
            // 分支注释
            return "密码为888登录成功";
        } else if ("777".equals(password)) {
            getTime.getTime(3);
            return "登录为777也成功";
        } else if ("999".equals(password)) {
            getTime.getTime(3);
            return "登录为999也成功";
        } else {
            getTime.getTime(0);
            return "登录失败，密码" + password;
        }
    }

    @RequestMapping(value = "getTest", method = RequestMethod.GET)
    public String getTest(String userName, String password) {
        log.info("--------------------方法进入");
        PrintSH printSH = new PrintSH();
        printSH.printLog1();
        printSH.printLog1("修改的方法");
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
            return "777登录成功";
        } else {
            getTime.getTime(0);
            return "密码错误，登录失败";
        }
    }

    @RequestMapping(value = "getTest33", method = RequestMethod.GET)
    public String getTest33(String userName, String password) {
        log.info("--------------------getTest33方法进入");
        PrintSH printSH = new PrintSH();
        printSH.printLog1();
        printSH.printLog1("getTest33新增的方法");
        if (userName.isEmpty()) {
            getTime.getTime(1);
            return "登录失败，姓名为空";
        }
        // 方法中的注释
        if ("888".equals(password)) {
            getTime.getTime(2);
            // 分支注释
            return "888登录成功!";
        } else if ("777".equals(password)) {
            getTime.getTime(3);
            return "777登录成功!";
        } else {
            getTime.getTime(0);
            return "登录失败!!!";
        }
    }

    @RequestMapping(value = "getTest4", method = RequestMethod.GET)
    public String getTest4(String userName, String password) {
        log.info("--------------------getTest4方法进入");
        PrintSH printSH = new PrintSH();
        printSH.printLog1();
        printSH.printLog1("getTest4修改的方法");
        System.out.println("修改了，测试增量覆盖率");
        if (userName.isEmpty()) {
            getTime.getTime(1);
            return "登录失败，姓名为空";
        }
        // 方法中的注释
        if ("888".equals(password)) {
            getTime.getTime(2);
            // 分支注释
            return "888登录成功！";
        } else if ("777".equals(password)) {
            getTime.getTime(3);
            return "777登录成功！";
        } else if ("666".equals(password)) {
            getTime.getTime(3);
            return "666登录成功！";
        } else if ("555".equals(password)) {
            getTime.getTime(3);
            return "555登录成功！";
        } else {
            getTime.getTime(0);
            return "登录失败！！！";
        }
    }


    @RequestMapping(value = "getTest5", method = RequestMethod.GET)
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

    @PostMapping("/test33")
    public String computeFeature(User111 user) {
        log.info("--------------------方法进入");
        // 新增注释
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 20, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<>(20));

        User111 ruser = new User111();
        CompletableFuture<Void> f1 = CompletableFuture.runAsync(() -> {
            user.setUsername("uuu");
            System.out.println(Thread.currentThread().getName());
        }, executor);
        CompletableFuture<Void> f2 = CompletableFuture.runAsync(() -> {
            user.setPassword("ppp");
            System.out.println(Thread.currentThread().getName());
        }, executor);
        CompletableFuture<Void> f3 = CompletableFuture.runAsync(() -> {
            user.setAddress("1342====");
            System.out.println(Thread.currentThread().getName());
        }, executor);
        CompletableFuture.allOf(f1, f2, f3).join();
        System.out.println(user);
        return user.toString();
    }
}
