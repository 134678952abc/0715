package com.gff.zy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test3 {
        public static void main(String[] args) {
            dd();

        }

        private static void dd() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入人生日，格式为yyyy-MM-dd");
            String sc = scanner.nextLine();
            //sc.split("-");
            String strDateFormat = "yyyy-MM-dd";
            SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
            long i = new Date().getTime();

            try {

                Date parse = sdf.parse(sc);
                i-=parse.getTime();
                System.out.println("您已经来到这个世界"+i/86400000/7+"周");
            } catch (ParseException e) {
                System.out.println("您的输入的日期格式有误，请仔细填写");
                e.printStackTrace();
            }
        }

}

