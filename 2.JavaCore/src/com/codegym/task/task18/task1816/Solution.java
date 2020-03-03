package com.codegym.task.task18.task1816;

/* 
ABCs

*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputstream = new FileInputStream(args[0]);
        int aux=0;
        while (inputstream.available() > 0) {
            int data = inputstream.read();
            //System.out.println(data);
            if(data>=65&&data<=90){
                aux++;
            }
            if(data>=97&&data<=122){
                aux++;
            }
        }
        inputstream.close();
        System.out.println(aux);
    }
}
