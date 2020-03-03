package com.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Method in a try-catch

*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> a = new ArrayList<Integer>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            boolean b=true;
            while(b){
                int s= Integer.parseInt(br.readLine());
                a.add(s);
            }
        }
        catch (NumberFormatException e){
            for(Integer i:a){
                System.out.println(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
