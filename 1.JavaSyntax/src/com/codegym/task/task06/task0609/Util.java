package com.codegym.task.task06.task0609;

/* 
Distance between two points

*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double a= Math.pow((x1-x2),2);
        double b= Math.pow((y1-y2),2);
        double c= Math.sqrt(a+b);
        return c;
    }

    public static void main(String[] args) {

    }
}
