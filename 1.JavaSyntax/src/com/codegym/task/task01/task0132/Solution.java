package com.codegym.task.task01.task0132;

/* 
Sum of the digits of a three-digit number

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int n = number;
        int n2 = 0;
        int aux=0;
        int r=10;
        int count =0;
        while (n != 0) {
            n2 = n2+(n % 10);
            n = n / 10;
            ++count;
        }

        return n2;
    }
}