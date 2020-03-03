package com.codegym.task.task18.task1810;

/* 
DownloadException

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String filename = br.readLine();
            FileInputStream inputstream = new FileInputStream(filename);
            if (inputstream.available() < 1000) {
                inputstream.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
