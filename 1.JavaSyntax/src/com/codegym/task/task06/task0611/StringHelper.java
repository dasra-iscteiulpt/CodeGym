package com.codegym.task.task06.task0611;

/* 
StringHelper class

*/

public class StringHelper {
    public static String multiply(String s) {
        String result = s+s+s+s+s;
        return result;
    }

    public static String multiply(String s, int count) {
        int x=0;
        String result="";
        while (x<count){
            result+=s;
            x++;
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
