package com.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Different methods for different types

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String s = reader.readLine();
                if (s.equals("exit"))
                    break;
                else {
                    try {
                    if (s.contains("."))
                        print(Double.parseDouble(s));
                    else if(Integer.parseInt(s)<=0 || Integer.parseInt(s)>=128)
                        print(Integer.parseInt(s));
                    else if(Short.parseShort(s)>0 && Short.parseShort(s)<128)
                        print(Short.parseShort(s));
                    else{
                        print(s);
                    }
                }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                        print(s);
                    }
            }
        }


    }

    public static void print(Double value) {
        System.out.println("This is a Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("This is a String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("This is a short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("This is an Integer. Value: " + value);
    }
}
