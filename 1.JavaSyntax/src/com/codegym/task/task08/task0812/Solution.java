package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.*;

/* 
Longest sequence

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        int aux=0;
        while (aux<10) {
            int s = Integer.parseInt(reader.readLine());
            list.add(s);
            aux++;
        }
        int count=1;
        aux=0;
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        while (aux<list.size()) {
                if(aux==list.size()-1){
                    list2.add(count);
                    break;
                }
                if (!list.get(aux+1).equals(list.get(aux))) {
                    list2.add(count);
                    count = 1;
                }
                else{
                    count++;
                }
            aux++;
        }

        int y=list2.get(0);
        for (Integer i : list2)
        {
            if(i>y)
                y=i;
        }
        System.out.println(y);
    }
}