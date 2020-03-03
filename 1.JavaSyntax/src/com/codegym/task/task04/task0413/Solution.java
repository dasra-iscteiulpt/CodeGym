package com.codegym.task.task04.task0413;

/* 
Day of the week

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        if(i<1|i>7)
            System.out.println("No such day of the week");
        if(i==1)
            System.out.println("Monday");
        if(i==2)
            System.out.println("Tuesday");
        if(i==3)
            System.out.println("Wednesday");
        if(i==4)
            System.out.println("Thursday");
        if(i==5)
            System.out.println("Friday");
        if(i==6)
            System.out.println("Saturday");
        if(i==7)
            System.out.println("Sunday");

    }
}