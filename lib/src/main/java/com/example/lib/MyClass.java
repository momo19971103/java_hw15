package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入現在時間(時:分:秒)");
        String s = scanner.next();
        String HR,MIN;
        int hr,min;
        int F =s.indexOf(":");
        int E = s.lastIndexOf(":");
        HR = s.substring(0,F);
        MIN = s.substring(F+1,E);
        hr=Integer.parseInt(HR);
        min=Integer.parseInt(MIN);
        int totalM =hr*60+min;
        if(totalM>=450&&totalM<1020){
            System.out.println("現在是上課時間");
        }
        else {
            System.out.println("現在是下課時間");
        }


    }
}
