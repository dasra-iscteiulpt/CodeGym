package com.codegym.task.task18.task1819;

/* 
Combining files

*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) {
        BufferedReader br = null;
        FileInputStream inputStream1 = null;
        FileOutputStream outputStream1 = null;
        FileInputStream inputStream2 = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            String fileName1 = br.readLine();
            String fileName2 = br.readLine();
            int i=0;
            inputStream1 = new FileInputStream(fileName1);
            byte[]file1 = new byte[inputStream1.available()];
            byte[] buff1 = new byte[inputStream1.available()];

            while (inputStream1.available() > 0) {
                int data = inputStream1.read();
                file1[i]=(byte)data;
                i++;
            }

            outputStream1 = new FileOutputStream(fileName1);
            inputStream2 = new FileInputStream(fileName2);
            byte[] buff2 = new byte[inputStream2.available()];

            while (inputStream2.available() > 0) {
                int data = inputStream2.read(buff2);
                outputStream1.write(buff2, 0, data);
                outputStream1.write(file1);
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {
            try {
                if (br != null)
                    br.close();
                if (inputStream1 != null)
                    inputStream1.close();
                if (outputStream1 != null)
                    outputStream1.close();
                if (inputStream2 != null)
                    inputStream2.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
