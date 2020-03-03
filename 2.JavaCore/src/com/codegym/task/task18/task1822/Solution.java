package com.codegym.task.task18.task1822;

/* 
Finding data inside a file

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader br=null;
        FileInputStream inputStream1 = null;
        String s="", bytes="";
        int count=0;
        ArrayList<String> al=new ArrayList<String>();
        try {
            br=new BufferedReader(new InputStreamReader(System.in));
            s=br.readLine();
            inputStream1 = new FileInputStream(s);
            ArrayList<String> b = new ArrayList<String>();
            while (inputStream1.available() > 0) {
                int data = inputStream1.read();
                if(data==10){
                    al.add(bytes);
                    bytes = "";
                }
                else{
                    bytes += (char) data;
                }

            }
            al.add(bytes);

            for (String str : al) {

                //System.out.println("eu sou a string "+str.substring(0,str.indexOf(" ")));
                if(str.substring(0,str.indexOf(" ")).equals(args[0])){
                    System.out.println(str.substring(0,str.length()));
                }
            }


        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (inputStream1 != null)
                    inputStream1.close();
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
