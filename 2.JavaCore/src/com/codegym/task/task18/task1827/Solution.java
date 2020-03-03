package com.codegym.task.task18.task1827;

/* 
Prices

*/

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        if (args.length > 0) {
            File file = new File(fileName);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String id = "", productName = "", price = "", quantity = "", data = "";
            int i = 0, idI = 0;
            String st;
            List<String> lines = new ArrayList<String>();
            while ((st = reader.readLine()) != null) {
                lines.add(st);
                if (st.substring(0, 8).contains(" ")) {
                    id = st.substring(0, st.substring(0, 8).indexOf(" "));
                } else {
                    id = st.substring(0, 8);
                }
                i = Integer.parseInt(id);
                if (i > idI) {
                    idI = i;
                }
            }
            reader.close();

            id = padRight(String.valueOf(idI + 1), 8);
            productName = padRight(args[1], 30);
            price = padRight(args[2], 8);
            quantity = padRight(args[3], 4);
            data = id + productName + price + quantity;
            lines.add(data);

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (int x = 0; x < lines.size() ; x++) {
                writer.write(lines.get(x));
                writer.newLine();
            }
            writer.close();
        }
    }

    public static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }
}

