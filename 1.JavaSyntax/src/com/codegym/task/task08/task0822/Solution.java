package com.codegym.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* 
Minimum of N numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int x=Collections.min(array);
        return x;
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> list = new ArrayList<Integer>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(br.readLine());
        int aux=0;
        while(aux<i){
            int n=Integer.parseInt(br.readLine());
            list.add(n);
            aux++;
        }
        return list;
    }
}
