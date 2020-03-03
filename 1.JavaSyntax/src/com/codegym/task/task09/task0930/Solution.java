package com.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            //System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        List<Integer> num = new ArrayList<Integer>();
        List<String> str= new ArrayList<String>();
        List<String> arr = new ArrayList<String>();
        int aux=0;
        int aux2=0;

        for (String s:array) {
            if(isNumber(s)){
                num.add((Integer.parseInt(s)));
                arr.add("n");
            }
            else{
                str.add(s);
                arr.add("s");
            }
            aux++;
        }
                int var1=0;
        for (String s:str) {
            int var2 = 0;
            for (String s2 : str) {
                if (!isGreaterThan(s, s2)) {
                    Collections.swap(str, var1, var2);
                }
                var2++;
            }
            var1++;
        }

        Collections.sort(num,Collections.reverseOrder());

        List<String> list = new ArrayList<String>();
        Iterator itStr=str.iterator();
        Iterator itNum=num.iterator();
        for (String s:arr) {
            if(s.equals("n")){
                list.add(itNum.next().toString());
            }
            if(s.equals("s")){
                list.add(itStr.next().toString());
            }
        }
        for (String s:list) {
            System.out.println(s);
        }
    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Is the passed string a number?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // The string contains a hyphen
                    || (!Character.isDigit(c) && c != '-') // or is not a number and doesn't start with a hyphen
                    || (i == 0 && c == '-' && chars.length == 1)) // or is a single hyphen
            {
                return false;
            }
        }
        return true;
    }
}
