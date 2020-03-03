package com.codegym.task.task09.task0926;

import java.util.ArrayList;

/* 
List of number arrays

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list=new ArrayList<int[]>();
        int[] a={1,2,3,4,5};
        list.add(a);
        int[] b={1,2};
        list.add(b);
        int[] c={1,2,3,4};
        list.add(c);
        int[] d={1,2,3,4,5,6,7};
        list.add(d);
        int[] e={};
        list.add(e);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
