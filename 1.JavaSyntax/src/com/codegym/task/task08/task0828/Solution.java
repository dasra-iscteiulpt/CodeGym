package com.codegym.task.task08.task0828;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Month number

*/

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("MMM");
        cal.setTime(sdf.parse(s));
        int i=cal.get(Calendar.MONTH);
        i++;
        Map<Integer,String> month = new HashMap<>();
        month.put(i,s);
        System.out.println(month.get(i)+" is month "+i);
    }
}
