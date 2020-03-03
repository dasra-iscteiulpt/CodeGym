package com.codegym.task.task18.task1808;

/* 
Splitting a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        String filename2 = br.readLine();
        String filename3 = br.readLine();
        int aux = 0, var = 0;
        FileInputStream inputstream2 = new FileInputStream(filename);
        FileOutputStream outputstream1 = new FileOutputStream(filename2);
        FileOutputStream outputstream2 = new FileOutputStream(filename3);

        aux=inputstream2.available();
        if (aux % 2 == 0) {
            while (inputstream2.available() > 0) {
                if (var==0) {
                    byte[] buffer = new byte[aux/2];
                    int data = inputstream2.read(buffer);
                    outputstream1.write(buffer, 0, data);
                } else {
                    byte[] buffer = new byte[aux/2];
                    int data = inputstream2.read(buffer);
                    outputstream2.write(buffer, 0, data);
                }
                var++;
            }

        } else {
            while (inputstream2.available() > 0) {
                if (var==0) {
                    byte[] buffer = new byte[aux/2+1];
                    int data = inputstream2.read(buffer);
                    outputstream1.write(buffer, 0, data);
                } else {
                    byte[] buffer = new byte[aux/2];
                    int data = inputstream2.read(buffer);
                    outputstream2.write(buffer, 0, data);
                }
                var++;
            }
        }
        inputstream2.close();
        br.close();
        outputstream1.close();
        outputstream2.close();

    }
}
