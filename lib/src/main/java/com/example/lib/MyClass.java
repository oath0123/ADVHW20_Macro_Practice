package com.example.lib;

import java.math.Standar;
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]){

        float a=0,b=0,c=0;
        Standar standar=new Standar();
        Scanner scanner=new Scanner(System.in);
        System.out.println("請輸入a:");
        a=Float.parseFloat(scanner.next());
        System.out.println("請輸入b:");
        b=Float.parseFloat(scanner.next());
        System.out.println("請輸入c:");
        c=Float.parseFloat(scanner.next());
       System.out.println( standar.f(a,b,c));
    }
}
