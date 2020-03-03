package com.codegym.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        //t1.join();
        Read3Strings t2 = new Read3Strings();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        //write your code here

        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread{
        String line="";
        public void run() {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String line2="";
            int aux=0;
            while (aux++<3){
                try {
                    String s=br.readLine();
                    line=line+line2+s;
                    line2= " ";
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public void printResult() {
            System.out.println(line);
        }
    }
}
