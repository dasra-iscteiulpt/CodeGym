package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> al = new ArrayList<String>();
        ArrayList<Integer> in = new ArrayList<Integer>();
        InputStream inputStream = null;
        BufferedInputStream buffer = null;
        BufferedReader br=null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            inputStream = new FileInputStream(s);
            buffer = new BufferedInputStream(inputStream);
            String aux="";
            int i;
            while ((i = buffer.read()) != -1) {
                char c= (char) i;
                if((c == '\n')) {
                    al.add(aux);
                    aux="";
                    //System.out.println("im here");
                }
                else{
                    aux=aux+c;
                }
            }
            al.add(aux);

            for(String s1:al){
                int val = Integer.parseInt(s1.trim());
                if(val%2==0){
                    in.add(val);
                }
            }
            Collections.sort(in);
            for(Integer val:in) {
                System.out.println(val);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        } finally {
            br.close();
            inputStream.close();
            buffer.close();

        }
    }
}
