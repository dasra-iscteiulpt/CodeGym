package com.codegym.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Solution {
    public static List<String> lines = new ArrayList<>();
    static {
        try {
            File myObj = new File(Statics.FILE_NAME);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lines.add(data);
                //System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
