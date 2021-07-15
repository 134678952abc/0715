package com.gff.zy;

import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        //获取当前时间
        Date date = new Date();
        System.out.println("date =" + date);
        long time = date.getTime();
        System.out.println("time =" + time);
        //三天后的时间
        long time1 = 1000*60*60*24*3;
        date.setTime(date.getTime()+time1);
        System.out.println("date ="+ date);
    }
}

