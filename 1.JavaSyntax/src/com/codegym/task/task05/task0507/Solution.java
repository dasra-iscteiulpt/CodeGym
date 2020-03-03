package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        double count=0;
        double aux=0;
        while (true) {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(br.readLine());
            if (number==-1)
                break;
            aux+=number;
            count++;

        }
        double d=aux/count;
        System.out.println(d);

    }
}

