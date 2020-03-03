package com.codegym.task.task17.task1710;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD

*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();
    /*public static String create = "-c Diana Salvador f \"12 05 1990\"";
    public static String create2 ="-c Washington m \"04 15 1990\"";
    public static String update = "-u 0 John Rambo m 06 10 1987";
    public static String delete = "-d 1";
    public static String view = "-i 0";*/

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void create(String[] args) throws ParseException {
        Sex sex = null;
        String name = "", bd = "";
        int aux = 0, i = 0, y = 1;
        bd = args[args.length - 1];
        name = args[1];
        for (String s : args) {
            if (s.equals("f")) {
                sex = Sex.FEMALE;
                i = aux;
                break;
            }
            if (s.equals("m")) {
                sex = Sex.MALE;
                i = aux;
                break;
            }
            aux++;
        }
        /*System.out.println("name: "+name);
        System.out.println("sex: "+sex);
        System.out.println("bd: "+bd);*/
        allPeople.add(Person.createMale(name, parseData(bd)));
        allPeople.get(allPeople.size() - 1).setSex(sex);
        System.out.println(allPeople.indexOf(allPeople.get(allPeople.size() - 1)));
        //System.out.println("size:" + allPeople.size());
    }

    public static void delete(String[] args) throws ParseException {
        int id = Integer.parseInt(args[1]);
        allPeople.get(id).setSex(null);
        allPeople.get(id).setName(null);
        allPeople.get(id).setBirthDate(null);
        //System.out.println("size:"+allPeople.size());
    }

    public static void update(String[] args) throws ParseException {
        Person person1 = allPeople.get(Integer.parseInt(args[1]));
        person1.setName(args[2]);
        //SimpleDateFormat dateFormat2 = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        person1.setBirthDate(parseData(args[4]));
        if (args[3].equals("m")) {
            person1.setSex(Sex.MALE);
        }
        else if (args[3].equals("f")) {
            person1.setSex(Sex.FEMALE);
        }
    }

    public static void information(String[] args) {
        int id = Integer.parseInt(args[1]);
        String sex = "";
        SimpleDateFormat print = new SimpleDateFormat("MMM dd yyyy");
        if (allPeople.get(id).getSex().equals(Sex.FEMALE))
            sex = "f";
        else
            sex = "m";
        System.out.println(allPeople.get(id).getName() + " " + sex + " " + print.format(allPeople.get(id).getBirthDate()));
    }

    public static void validate(String[] args) throws ParseException {

        if (args[0].equals("-c"))
            create(args);
        else if (args[0].equals("-u"))
            update(args);
        else if (args[0].equals("-i"))
            information(args);
        else if (args[0].equals("-d"))
            delete(args);
        else
            System.out.println("This isn't a valid input. Please try again.");
    }

    public static Date parseData(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
        Date parsedDate = sdf.parse(date);
        return parsedDate;
    }

    public static void main(String[] args) throws ParseException {
        validate(args);
    }


}
