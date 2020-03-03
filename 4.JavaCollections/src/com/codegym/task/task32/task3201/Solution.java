package com.codegym.task.task32.task3201;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
Writing to an existing file

*/
public class Solution {
    public static void main(String... args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(args[0], "rw");
        byte b[] = args[2].getBytes();
        // Write "text" to the file.
        if (raf.length() < Long.parseLong(args[1])) {
            raf.seek(raf.length());

        } else {
            // Move the "cursor" to the "number" character.
            raf.seek(Long.parseLong(args[1]));
        }
        raf.write(b);
        // Close the file.
        raf.close();
    }
}
