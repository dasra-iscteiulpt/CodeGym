package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.*;

import static java.util.Calendar.AUGUST;
import static java.util.Calendar.JUNE;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Mendes", df.parse("AUGUST 3 1980"));
        map.put("Salvador", df.parse("JANUARY 2 1930"));
        map.put("Maria", df.parse("NOVEMBER 7 1980"));
        map.put("Benedita", df.parse("DECEMBER 1 1980"));
        map.put("Mafalda", df.parse("FEBRUARY 2 1980"));
        map.put("Tome", df.parse("OCTOBER 9 1980"));
        map.put("Augusto", df.parse("JANUARY 2 1950"));
        map.put("Leticia", df.parse("JANUARY 9 1999"));
        map.put("Diana", df.parse("JUNE 2 2000"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Calendar c = Calendar.getInstance();
        Iterator<HashMap.Entry<String, Date>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Date> entry = iter.next();
            c.setTime(entry.getValue()); // add this
            if (c.get(Calendar.MONTH) == 5 || c.get(Calendar.MONTH) == 6 || c.get(Calendar.MONTH) == 7) {
                iter.remove();
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        removeAllSummerPeople(createMap());
    }
}
