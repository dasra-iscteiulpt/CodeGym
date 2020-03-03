package com.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Maximum in an array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int [] array=new int[20];
        for(int i=0; i<20;i++){
            int a = Integer.parseInt(br.readLine());
            array[i]=a;
        }
        return array;
    }

    public static int max(int[] array) {
        int aux=array[0];
        for(int i=0; i<20;i++){
            if(array[i]>aux)
                aux=array[i];
        }
        return aux;
    }
}
