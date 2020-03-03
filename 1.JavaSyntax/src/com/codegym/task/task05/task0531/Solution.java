package com.codegym.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Improving functionality

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }

    public static int min(int a, int b, int c, int d, int e) {
        String s=null;
        int aux=0;
        if(a<=b && a<=c && a<=d && a<=e)
            aux=a;
        if(b<=a && b<=c && b<=d && b<=e)
            aux=b;
        if(c<=a && c<=b && c<=d && c<=e)
            aux=c;
        if(d<=a && d<=b && d<=c && d<=e)
            aux=d;
        if(e<=a && e<=b && e<=c && e<=d)
            aux=e;
        return aux;
    }


}
