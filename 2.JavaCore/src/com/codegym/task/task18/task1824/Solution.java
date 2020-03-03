package com.codegym.task.task18.task1824;

/* 
Files and exceptions

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";
        InputStream inputstream = null;
        try {
            while (true) {
                fileName = br.readLine();
                inputstream = new FileInputStream(fileName);
                if (inputstream.available() > 0) inputstream.close();

            }
        } catch (FileNotFoundException e) {
            br.close();
            System.out.println(fileName);
        }

    }
}
