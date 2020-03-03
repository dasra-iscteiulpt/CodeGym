package com.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        Date date=new SimpleDateFormat("yyyy-MM-dd").parse(s);
        SimpleDateFormat formatter=new SimpleDateFormat("MMM dd, yyyy");
        String s2 = formatter.format(date).toUpperCase();

        System.out.println(s2);
    }
}
