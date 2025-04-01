package com.codey.util;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import com.codey.util.PrintSH;

public class GETTime {


    public void getTime1(){
        // 方法一：
        Date currentTime = new Date();
        System.out.println("getTime1");
        System.out.println(currentTime);
    }

    public void getTime2(){
        // 方法二aa：
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("getTime1");
        System.out.println(currentTime);
    }

    public void getTime3(){
        // 方法三aa：
        ZonedDateTime currentTime = ZonedDateTime.now();
        System.out.println("getTime3");
        System.out.println(currentTime);
    }

    public void getTime(int num){
        switch (num) {
            case 1:
                getTime1();
                break;
            case 2:
                getTime2();
                break;
            case 3:
                getTime3();
                break;
            default:
                getTime1();
                break;
        }
        System.out.println("分支执行完毕");
    }

    public void getTime3(Integer num){
        // 方法三aa：
        ZonedDateTime currentTime = ZonedDateTime.now();
        System.out.println("getTime3");
        System.out.println(currentTime);
    }


}
