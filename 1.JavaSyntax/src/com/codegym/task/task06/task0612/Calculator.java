package com.codegym.task.task06.task0612;

/* 
Calculator

*/

public class Calculator {
    public static int plus(int a, int b) {
        int c=a+b;
        return c;
    }

    public static int minus(int a, int b) {
        int c=a-b;
        return c;
    }

    public static int multiply(int a, int b) {
        int c=a*b;
        return c;
    }

    public static double divide(int a, int b) {
        double c = ((double)a/(double)b);
        System.out.println(c);
        return c;
    }

    public static double percent(int a, int b) {
        double c=(double)a*(double)b/100;
        return c;
    }

    public static void main(String[] args) {

    }
}