package com.codegym.task.task10.task1011;

/* 
Big salary

*/

public class Solution {
    public static void main(String[] args) {
        String s = "I do not want to learn Java. I want a big salary";
        int aux=1;
        String s1=s;
        while(aux<=43){
            System.out.println(s1);
            s1=s.substring(aux,s.length());

            aux++;
        }
        //write your code here
    }

}

