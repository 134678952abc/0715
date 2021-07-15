package com.gff.zy;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    //将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date =" + date);
        long time = date.getTime();
        System.out.println("time =" + time);
        String pattern = "yyyy-MM-dd HH:m:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String chinaDataStr = sdf.format(date);
        System.out.println("chinaDateStr = " + chinaDataStr);
    }
}

