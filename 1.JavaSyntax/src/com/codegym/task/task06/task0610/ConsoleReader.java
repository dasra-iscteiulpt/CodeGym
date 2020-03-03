package com.codegym.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
ConsoleReader class

*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        return s;
    }

    public static int readInt() throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(br.readLine());
        return i;
    }

    public static double readDouble() throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double i=Double.parseDouble(br.readLine());
        return i;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        if(s.equals("true"))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

    }
}
