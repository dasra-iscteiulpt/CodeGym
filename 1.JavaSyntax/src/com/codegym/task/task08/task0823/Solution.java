package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Going national

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int y=1;
        while(s.substring(0,1).equals(" ")) {
            s=s.substring(1);
        }
        String[] list = s.split("\\s+");
        int aux=0;
        while(aux<list.length){
            String x=list[aux].substring(0,1).toUpperCase();
            String all=x+list[aux].substring(1);
            list[aux]=all;
            //System.out.println(all);
            aux++;
        }
        int aux2=0;
        while(aux2<list.length){
            System.out.print(list[aux2] + " ");
            aux2++;
        }

    }
}
