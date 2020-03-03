package com.codegym.task.task19.task1914;

/* 
Problem solving

*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //Save the current PrintStream in a special variable
        String n1="",n2="",finalString="";
        int n3=0;
        PrintStream consoleStream = System.out;

        //Create a dynamic array
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //Create an adapter for the PrintStream class
        PrintStream stream = new PrintStream(outputStream);
        //Set it as the current System.out
        System.setOut(stream);

        //Call a function that knows nothing about our changes
        testString.printSomething();

        //Convert the data written to our ByteArray into a string
        String result = outputStream.toString();

        //Put everything back to the way it was
        System.setOut(consoleStream);

        if(result.contains("+")){
            n1=result.substring(0,result.indexOf(" "));
            n2=result.substring(result.indexOf("+")+2,result.indexOf("=")-1);
            n3=Integer.parseInt(n1)+Integer.parseInt(n2);
            finalString=n1+" + "+n2+" = "+n3;
        }
        if(result.contains("-")){
            n1=result.substring(0,result.indexOf(" "));
            n2=result.substring(result.indexOf("-")+2,result.indexOf("=")-1);
            n3=Integer.parseInt(n1)-Integer.parseInt(n2);
            finalString=n1+" - "+n2+" = "+n3;
        }
        if(result.contains("*")){
            n1=result.substring(0,result.indexOf(" "));
            n2=result.substring(result.indexOf("*")+2,result.indexOf("=")-1);
            n3=Integer.parseInt(n1)*Integer.parseInt(n2);
            finalString=n1+" * "+n2+" = "+n3;
        }
        //Output it to the console
        System.out.println(finalString);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

