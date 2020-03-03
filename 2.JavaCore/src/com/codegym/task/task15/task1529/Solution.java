package com.codegym.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Mastering the static block

*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s=br.readLine();
            if(s.equals("helicopter")){
                result=new Helicopter();
            }
            else if(s.equals("plane")){
                int i=Integer.parseInt(br.readLine());
                result=new Plane(i);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
