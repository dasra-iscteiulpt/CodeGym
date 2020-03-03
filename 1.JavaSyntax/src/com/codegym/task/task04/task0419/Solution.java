package com.codegym.task.task04.task0419;

/* 
Maximum of four numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(br1.readLine());
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        int i2 = Integer.parseInt(br2.readLine());
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        int i3 = Integer.parseInt(br3.readLine());
        BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
        int i4 = Integer.parseInt(br4.readLine());

        if(max(i1,i2)>max(i3,i4)){
            System.out.println(max(i1,i2));
        }
        else if(max(i1,i2)<max(i3,i4)){
            System.out.println(max(i3,i4));
        }
        else{
            System.out.println(max(i1,i2));
        }

    }
    public static int max(int a, int b){
        int i1=a;
        int i2=b;
        if(i1>i2)
            return i1;
        else{
            return i2;
        }
    }
}
