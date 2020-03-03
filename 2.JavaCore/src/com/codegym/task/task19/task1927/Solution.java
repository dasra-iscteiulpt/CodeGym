package com.codegym.task.task19.task1927;

/* 
Contextual advertising

*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String s = new String(outputStream.toByteArray());
        String[] list = s.split("\n");
        System.setOut(consoleStream);
        int count = 1;
        for (String str : list) {
            System.out.println(str);
            if (count % 2 == 0) {
                System.out.println("CodeGym - online Java courses");
            }
            count++;

        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
