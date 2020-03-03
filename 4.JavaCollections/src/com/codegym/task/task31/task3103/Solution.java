package com.codegym.task.task31.task3103;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/* 
Your own implementation

*/
public class Solution {
    public static byte[] readBytes(String filename) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(filename)));
        byte[] bytes = content.getBytes();
        return bytes;
    }

    public static List<String> readLines(String filename) throws IOException {
        List<String> allLines = Files.readAllLines(Paths.get(filename));
        return allLines;
    }

    public static void writeBytes(String filename, byte[] bytes) throws IOException {
        Files.write(Paths.get(filename), bytes);
    }

    public static void copy(String resourceFilename, String destinationFilename) throws IOException {
        Files.copy(Paths.get(resourceFilename), Paths.get(destinationFilename));
    }
    public static void main(String[] args) throws IOException {
        readBytes("C:/Users/Diana Salvador/Desktop/test1.txt");
    }
}