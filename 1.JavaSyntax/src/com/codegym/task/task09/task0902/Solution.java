package com.codegym.task.task09.task0902;

/* 
Stack trace revisited

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
        //String nameOfCurrMethod =Thread.currentThread().getStackTrace()[0].getMethodName();
        //System.out.println(nameOfCurrMethod);
    }

    public static String method1() {
        method2();
        String nameOfCurrMethod =Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(nameOfCurrMethod);
        return nameOfCurrMethod;
    }

    public static String method2() {
        method3();
        String nameOfCurrMethod =Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(nameOfCurrMethod);
        return nameOfCurrMethod;
    }

    public static String method3() {
        method4();
        String nameOfCurrMethod =Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(nameOfCurrMethod);
        return nameOfCurrMethod;
    }

    public static String method4() {
        method5();
        String nameOfCurrMethod =Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(nameOfCurrMethod);
        return nameOfCurrMethod;
    }

    public static String method5() {
        String nameOfCurrMethod =Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(nameOfCurrMethod);
        return nameOfCurrMethod;
        }
    }
