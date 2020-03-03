package com.codegym.task.task04.task0437;


/* 
Triangle of eights

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int aux=1;
        for(int i=0;i<10;i++){
                for(int j=0;j<aux;j++){
                System.out.print("8");
            }
            System.out.println();
                aux++;
        }
    }
}
