package com.codegym.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* 
John Johnson

*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    //Person p=new Person();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String line, year = "", month = "", day = "", name = "";
        while ((line = br.readLine()) != null) {
            String[] content = line.split(" ");
            StringBuilder fullName = new StringBuilder();
            for (int i = 0; i < content.length - 3; i++) {
                if (!content[i].equals("")) {
                    if (i == content.length - 4) {
                        fullName.append(content[i]);
                    } else {
                        fullName.append(content[i] + " ");
                    }
                }
            }
            Calendar myCal = Calendar.getInstance();
            myCal.set(Integer.parseInt(content[content.length - 1]) , Integer.parseInt(content[content.length - 3])-1, Integer.parseInt(content[content.length - 2]));
            Date birthday = myCal.getTime();
            Person p = new Person(fullName.toString(), birthday);
            PEOPLE.add(p);
            System.out.println(p.getBirthDate());
        }
        br.close();

    }
}
