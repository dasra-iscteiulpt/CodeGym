package com.codegym.task.task04.task0427;

/* 
Describing numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String i1 = br1.readLine();
        if(Integer.parseInt(i1)>999 || Integer.parseInt(i1)<=0){

        }
        else if(i1.length()==1 && Integer.parseInt(i1)%2==0){
            System.out.println("even single-digit number");
        }
        else if(i1.length()==1 && Integer.parseInt(i1)%2!=0){
            System.out.println("odd single-digit number");
        }
        else if(i1.length()==2 && Integer.parseInt(i1)%2==0){
            System.out.println("even two-digit number");
        }
        else if(i1.length()==2 && Integer.parseInt(i1)%2!=0){
            System.out.println("odd two-digit number");
        }
        else if(i1.length()==3 && Integer.parseInt(i1)%2==0){
            System.out.println("even three-digit number");
        }
        else if(i1.length()==3 && Integer.parseInt(i1)%2!=0){
            System.out.println("odd three-digit number");
        }
    }
}
