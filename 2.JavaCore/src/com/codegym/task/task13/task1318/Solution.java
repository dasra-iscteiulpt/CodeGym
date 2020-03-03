package com.codegym.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Reading a file

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        BufferedInputStream buffer = null;
        BufferedReader br=null;
        String aux="";
        try {

            br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            inputStream = new FileInputStream(s);
            buffer = new BufferedInputStream(inputStream);

            while(buffer.available()>0) {

                char c = (char)buffer.read();

                aux=aux+c;
            }
            System.out.println(aux);

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