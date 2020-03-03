package com.codegym.task.task06.task0622;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Ascending numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> a=new ArrayList<Integer>();
       int count=0;
        while (count<5){
            int i = Integer.parseInt(reader.readLine());
            a.add(i);
            count++;
        }
        Collections.sort(a);
        count=0;
        while (count<5){
            System.out.println(a.get(count));
            count++;
        }
        //write your code here
    }
}
