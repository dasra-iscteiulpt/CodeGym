package com.codegym.task.task06.task0606;

import java.io.*;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int aux=a;
        int b=0, c=0, d=0;
        while(aux>0){
            b=aux%10;
            if(b%2==0)
                c++;
            else
                d++;
            aux=aux/10;
        }
        Solution.even=c;
        Solution.odd=d;
        System.out.println("Even: " + Solution.even + " Odd: "+ Solution.odd);
    }
}
