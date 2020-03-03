package com.codegym.task.task18.task1825;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

/* 
Building a file

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> fileNameList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> hash = new HashMap<String, String>();
        TreeMap<String, String> map = new TreeMap<String, String>();
        while (true) {
            String s = br.readLine();
            if (s.equals("end")) {
                break;
            } else {
                fileNameList.add(s);
            }
        }

        String fileName = null;
        for (String file : fileNameList) {
            int b = file.lastIndexOf(".");
            fileName = file.substring(0, b);
            //System.out.println(file.substring(0, b + 1));

        }
        Collections.sort(fileNameList);
        FileOutputStream bufferedWriter = new FileOutputStream(fileName);
        BufferedOutputStream outputStream = new BufferedOutputStream(bufferedWriter);
        for (String file : fileNameList) {
            FileInputStream reader = new FileInputStream(file);
            byte[] data = new byte[reader.available()];
            while(reader.available() > 0) {
                reader.read(data);
                outputStream.write(data);
            }
            reader.close();
            //inputStream.close();
        }
        br.close();
        outputStream.close();
        bufferedWriter.close();
    }
}
