package com.codegym.task.task10.task1015;

import java.util.ArrayList;

/* 
Array of string lists

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayOfStringList=new ArrayList[3];
        for (int i = 0; i < 3; i++) {
            arrayOfStringList[i] = new ArrayList<String>();
        }
        arrayOfStringList[0].add("0");
            arrayOfStringList[0].add("1");
            arrayOfStringList[0].add("2");
            arrayOfStringList[1].add("3");
            arrayOfStringList[1].add("4");
            arrayOfStringList[1].add("5");
            arrayOfStringList[2].add("6");
            arrayOfStringList[2].add("7");
            arrayOfStringList[2].add("8");
        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}