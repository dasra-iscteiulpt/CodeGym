package com.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Checking the order

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0; i<10;i++){
            String s = br.readLine();
            list.add(s);
        }
        int aux=list.get(0).length();
        for(int i=1; i<list.size();i++){
            if(aux>list.get(i).length()) {
                System.out.println(i);
                break;
            }
            else{
                aux=list.get(i).length();
            }
        }
    }
}

