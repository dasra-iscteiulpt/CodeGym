package com.codegym.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2

*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();
    /*public static String create = "-c Diana Salvador f \"12 05 1990\"";
        public static String create2 ="-c Washington m \"04 15 1990\"";
        public static String update = "-u 0 John Rambo m 06 10 1987";
        public static String delete = "-d 1";
        public static String view = "-i 0";*/

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static Date parseData(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
        Date parsedDate = sdf.parse(date);
        return parsedDate;
    }

    public static void main(String[] args) throws ParseException {
        if (args.length != 0) {

            switch (args[0]) {

                case "-c":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i = i + 3) {
                            String bd = args[i + 2];
                            if (args[i + 1].equals("m")) {
                                allPeople.add(Person.createMale(args[i], parseData(bd)));
                                System.out.println(allPeople.size() - 1);
                            } else if (args[i + 1].equals("f")) {
                                allPeople.add(Person.createFemale(args[i], parseData(bd)));
                                System.out.println(allPeople.size() - 1);
                            }
                        }
                        break;
                    }

                case "-u":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i = i + 4) {
                            Person person1 = allPeople.get(Integer.parseInt(args[i]));
                            String bd1 = args[i + 3];
                            person1.setName(args[i + 1]);
                            person1.setBirthDate(parseData(bd1));
                            if (args[i + 2].equals("m")) {
                                person1.setSex(Sex.MALE);
                            } else if (args[i + 2].equals("f")) {
                                person1.setSex(Sex.FEMALE);
                            }
                        }
                        break;
                    }

                case "-d":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            Person person2 = allPeople.get(Integer.parseInt(args[i]));
                            person2.setName(null);
                            person2.setBirthDate(null);
                            person2.setSex(null);
                        }
                        break;
                    }

                case "-i":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            Person person3 = allPeople.get(Integer.parseInt(args[i]));
                            String sex = "";
                            SimpleDateFormat print = new SimpleDateFormat("MMM dd yyyy");
                            if (person3.getSex().equals(Sex.FEMALE))
                                sex = "f";
                            else
                                sex = "m";
                            System.out.println(person3.getName() + " " + sex + " " + print.format(person3.getBirthDate()));
                        }
                        break;
                    }
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
}
