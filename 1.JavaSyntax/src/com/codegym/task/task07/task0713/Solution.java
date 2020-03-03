package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for(int i=0; i<20;i++){
            int s = Integer.parseInt(br.readLine());
            ints.add(s);
        }
        for(int i=0; i<ints.size();i++){
            int x=ints.get(i);
            if(x%3==0)
                list1.add(x);
            if(x%2==0)
                list2.add(x);
            if(x%3!=0 && x%2!=0)
                list3.add(x);
        }
        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(List<Integer> list) {
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
