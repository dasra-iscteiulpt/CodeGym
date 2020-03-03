package com.codegym.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
In decreasing order

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        int[] aux = new int[array.length];
        int j = 0;
        for (int i = 0;i<array.length; i++) {
            for (int x = 0;x<array.length; x++) {
                if (array[x] < array[i]) {
                    j = array[x];
                    array[x] = array[i];
                    array[i] = j;
                }
            }

        }
    }
}