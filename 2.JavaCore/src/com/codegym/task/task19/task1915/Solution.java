package com.codegym.task.task19.task1915;

/* 
Duplicate text

*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);

        testString.printSomething();

        String result = outputStream.toString();

        System.setOut(consoleStream);
        FileOutputStream fout=new FileOutputStream(input);
        byte[] b = result.getBytes();
        fout.write(b);
        fout.close();
        System.out.println(result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This is text for testing");
        }
    }
}

