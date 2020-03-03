package com.codegym.task.task18.task1820;

/* 
Rounding numbers

*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        FileInputStream inputStream1 = null;
        FileOutputStream outputStream1 = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            String fileName1 = br.readLine();
            String fileName2 = br.readLine();
            inputStream1 = new FileInputStream(fileName1);
            outputStream1 = new FileOutputStream(fileName2);
            byte[] buffer = new byte[inputStream1.available()];
            String s = "";
            int i = 0, aux = inputStream1.available();
            ArrayList<String> numbers = new ArrayList<String>();
            ArrayList<Integer> numbersInt = new ArrayList<Integer>();

            while (inputStream1.available() > 0) {
                int data = inputStream1.read();
                if (data == 32) {
                    numbers.add(s);
                    s = "";
                } else {
                    s += (char) data;
                    //System.out.println(s);
                }
            }

            numbers.add(s);
            for (String str : numbers) {
                i = (int) Math.round(Double.parseDouble(str));
                outputStream1.write(String.valueOf(i).getBytes());
                outputStream1.write((byte)32);
                //System.out.println(i);
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

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
