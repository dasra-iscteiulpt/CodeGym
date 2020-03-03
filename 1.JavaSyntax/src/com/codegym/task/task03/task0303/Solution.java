package com.codegym.task.task03.task0303;

/* 
Currency exchange

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println( convertEurToUsd(123, 1.2));
        System.out.println( convertEurToUsd(450, 1.2));//write your code here
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        double usDollar = eur*exchangeRate;//write your code here
        return usDollar;
    }
}
