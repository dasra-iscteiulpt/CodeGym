package com.codegym.task.task18.task1818;

/* 
Two in one

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        FileInputStream inputStream1 = null;
        FileInputStream inputStream2 = null;
        FileOutputStream outputStream = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            String fileName1 = br.readLine();
            String fileName2 = br.readLine();
            String fileName3 = br.readLine();
            String s = "";
            inputStream1 = new FileInputStream(fileName2);
            inputStream2 = new FileInputStream(fileName3);
            outputStream = new FileOutputStream(fileName1,true);
            byte[] buff1 = new byte[inputStream1.available()];
            byte[] buff2 = new byte[inputStream2.available()];

            while (inputStream1.available() > 0) {
                int data = inputStream1.read(buff1);
                outputStream.write(buff1, 0, data);
            }
            inputStream1.close();
            while (inputStream2.available() > 0) {
                int data = inputStream2.read(buff2);
                outputStream.write(buff2, 0, data);
            }



        } catch (IOException e) {

            e.printStackTrace();

        } finally {
            try {
                if (br != null)
                    br.close();
                if (inputStream1 != null)
                    inputStream1.close();
                if (outputStream != null)
                    outputStream.close();
                if (inputStream2 != null)
                    inputStream2.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
