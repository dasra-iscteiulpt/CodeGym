package com.codegym.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* 
Working with dates

*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 2 2000"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("MMM d yyyy");
        cal.setTime(sdf.parse(date));
        Calendar cal2 = Calendar.getInstance();
        cal2.set(cal.get(Calendar.YEAR),0,1);
        if(cal.get(Calendar.DATE)==1&&cal.get(Calendar.MONTH)==0)
            return true;
        else {
            Date startDate = cal.getTime();
            Date endDate = cal2.getTime();
            long startTime = startDate.getTime();
            long endTime = endDate.getTime();
            long diffTime = startTime - endTime;
            long diffDays = diffTime / (1000 * 60 * 60 * 24);
            if (diffDays % 2 == 0)
                return false;
            else
                return true;
        }
    }
}
