package com.codegym.task.task04.task0420;

/* 
Sorting three numbers

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
        int aux2=0;
        int aux3=0;
        if(i1>=i2){
            aux=i1;
            aux2=i2;
            if(i2>=i3){
                aux2=i2;
                aux3=i3;
            }
            else{
                if(i3 >= i1) {
                    aux=i3;
                    aux2=i1;
                    aux3=i2;
                }
                else{
                    aux2=i3;
                    aux3=i2;
                }
            }
        }
        else{
            aux=i2;
            aux2=i1;
            if(i2<=i3){
                aux=i3;
                aux2=i2;
                aux3=i1;
            }
            else{
                if(i3>=i1) {
                    aux=i2;
                    aux2=i3;
                    aux3=i1;
                }
                else{
                    aux=i2;
                    aux2=i1;
                    aux3=i3;
                }

            }
        }
        System.out.println(aux + " " + aux2 + " " + aux3);
    }
}
