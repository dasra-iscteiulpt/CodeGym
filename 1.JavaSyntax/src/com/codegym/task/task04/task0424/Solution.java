package com.codegym.task.task04.task0424;

/* 
Three numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(br1.readLine());
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        int i2 = Integer.parseInt(br2.readLine());
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        int i3 = Integer.parseInt(br3.readLine());
        int aux=0;
        if(i1==i2 && i3!=i1) {
            aux = 3;
            System.out.println(aux);
        }
        else if(i1==i3 && i2!=i1){
            aux=2;
            System.out.println(aux);}
        else if(i2==i3 && i1!=i2){
            aux=1;
            System.out.println(aux);}
        else if(i1!=i2 && i2!=i3){

        }

    }
}
