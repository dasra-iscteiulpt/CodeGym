package com.codegym.task.task32.task3210;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Using RandomAccessFile

*/

public class Solution {
    public static void main(String... args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(args[0], "rw");
        byte[] bytes = new byte[args[2].getBytes().length];
        raf.seek(Integer.parseInt(args[1]));
        raf.read(bytes, 0, bytes.length);
        String stringValue = new String(bytes);
        raf.seek(raf.length());

        if (stringValue.equals(args[2])) {
            byte[] t = "true".getBytes();
            raf.write(t);

        } else {
            byte[] f = "false".getBytes();
            raf.write(f);
        }

        // Close the file.
        raf.close();
    }
}