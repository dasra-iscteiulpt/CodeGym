package com.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Shuffled just in time

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0; i<n;i++){
            String s = br.readLine();
            list.add(s);
        }

        for(int i=0; i<m;i++){
            /*if(i<m) {
                list.add(list.get(i));
            }*/
            list.add(list.get(0));
            list.remove(0);
        }

        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));

        }

        //write your code here
    }
}
