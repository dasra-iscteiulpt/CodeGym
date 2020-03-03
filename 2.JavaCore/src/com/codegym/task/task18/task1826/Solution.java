package com.codegym.task.task18.task1826;

/* 
Encryption

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream(args[1]);
        FileOutputStream output = new FileOutputStream(args[2]);
        String id = "", productName = "", price = "", quantity = "", data = "", st;
        List<String> lines = new ArrayList<String>();
        BufferedWriter writer = null;
        if (args.length > 0) {
            switch (args[0]) {
                case "-e":
                    while (input.available() > 0) {
                        int n = input.read();
                        output.write(n + 1);
                    }
                    break;

                case "-d":
                    while (input.available() > 0) {
                        int n = input.read();
                        output.write(n - 1);
                    }
                    break;
            }
        }
        input.close();
        output.close();
    }

}
