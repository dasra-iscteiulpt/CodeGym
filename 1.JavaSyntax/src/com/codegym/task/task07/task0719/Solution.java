package com.codegym.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Display numbers in reverse order

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<10;i++){
            int x=Integer.parseInt(reader.readLine());
            list.add(0,x);
        }
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
