package com.codegym.task.task19.task1904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/* 
Yet another adapter

*/

public class Solution {

    public static void main(String[] args) {
        String line = "Larry Thomas Gates 12 31 1957";
        String[] splited = line.split("\\s+");
        String lastName=splited[2];
        String firstName=splited[0];
        String middleName=splited[1];
        Calendar myCal = Calendar.getInstance();

        myCal.set(Calendar.YEAR, Integer.parseInt(splited[5]));
        myCal.set(Calendar.MONTH, Integer.parseInt(splited[3])-1);
        myCal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(splited[4]));
        Date birthDate = myCal.getTime();
        System.out.println(lastName);
        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(birthDate);
        Person p=new Person(lastName,firstName,middleName,birthDate);
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner=fileScanner;
        }
        @Override
        public Person read() throws IOException {
            String line = fileScanner.nextLine();
            String[] splited = line.split("\\s+");
            String lastName=splited[2];
            String firstName=splited[0];
            String middleName=splited[1];
            Calendar myCal = Calendar.getInstance();
            myCal.set(Calendar.YEAR, Integer.parseInt(splited[5]));
            myCal.set(Calendar.MONTH, Integer.parseInt(splited[3])-1);
            myCal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(splited[4]));
            Date birthDate = myCal.getTime();
            Person p=new Person(lastName,firstName,middleName,birthDate);
            return p;
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
