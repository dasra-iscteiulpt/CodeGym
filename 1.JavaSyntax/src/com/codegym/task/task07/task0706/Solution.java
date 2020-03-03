package com.codegym.task.task07.task0706;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int [] array=new int[15];
        for(int i=0; i<15;i++){
            int s = Integer.parseInt(br.readLine());
            array[i]=s;
        }
        int aux1=0;
        int aux2=0;
        for(int i=1; i<15;i++){
            if(i==0)
                aux1=aux1+array[i];
            else if(i%2==0)
                aux1=aux1+array[i];
            else
                aux2=aux2+array[i];
        }
        if(aux1>aux2)
            System.out.println("Even-numbered houses have more residents.");
        else
            System.out.println("Odd-numbered houses have more residents.");
    }
}
