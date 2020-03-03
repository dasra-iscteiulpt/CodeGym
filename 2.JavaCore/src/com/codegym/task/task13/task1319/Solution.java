package com.codegym.task.task13.task1319;

import java.io.*;

/* 
Writing to a file from the console

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileWriter writer = null;
        BufferedWriter bw = null;
        BufferedReader br=null;
        String aux="";
        try {

            br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            writer = new FileWriter(s);
            bw = new BufferedWriter(writer);
            boolean b=true;

            while(b) {
                s=br.readLine();
                bw.write(s);
                bw.newLine();
                if(s.equals("exit")) {
                    b = false;
                }
            }

        }
        catch (Exception e){
            e.printStackTrace();
        } finally {
            br.close();
            bw.close();

        }
    }
}
