package com.codegym.task.task18.task1828;

/* 
Prices 2

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        File file = new File(fileName);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String id = "", productName = "", price = "", quantity = "", data = "", st;
        List<String> lines = new ArrayList<String>();
        BufferedWriter writer = null;
        if (args.length > 0) {
            switch (args[0]) {
                case "-u":
                    while ((st = reader.readLine()) != null) {
                        if (st.substring(0, 8).contains(args[1])) {
                            id = st.substring(0, 8);
                            productName = padRight(args[2], 30);
                            price = padRight(args[3], 8);
                            quantity = padRight(args[4], 4);
                            data = id + productName + price + quantity;
                            lines.add(data);
                        } else
                            lines.add(st);
                    }
                    reader.close();
                    writer = new BufferedWriter(new FileWriter(fileName));
                    for (int x = 0; x < lines.size(); x++) {
                        writer.write(lines.get(x));
                        writer.newLine();
                    }
                    writer.close();
                    break;

                case "-d":
                    while ((st = reader.readLine()) != null) {
                        if (!st.substring(0, 8).contains(args[1]))
                            lines.add(st);
                    }
                    reader.close();
                    writer = new BufferedWriter(new FileWriter(fileName));
                    for (int x = 0; x < lines.size(); x++) {
                        writer.write(lines.get(x));
                        writer.newLine();
                    }
                    writer.close();
            }
        }
    }

    public static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }

}
