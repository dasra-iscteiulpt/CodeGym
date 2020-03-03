package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum=Integer.MIN_VALUE;
        int minimum=Integer.MAX_VALUE;

        int [] array=new int[20];
        for(int i=0; i<20;i++){
            int s = Integer.parseInt(reader.readLine());
            array[i]=s;
            if(array[i]>maximum)
                maximum=array[i];
            if(array[i]<minimum)
                minimum=array[i];
        }

        System.out.print(maximum + " " + minimum);
    }
}
