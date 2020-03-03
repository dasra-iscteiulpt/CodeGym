package com.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> al = new HashMap<String, String>();
        String obj = "";
        try {
            String aux = "";
            String s = br.readLine();
            s = s.substring(s.indexOf("?") + 1);

            String[] numbers = s.split("&");
            for (String number : numbers) {
                if (number.contains("=")) {
                    String v1 = number.substring(number.indexOf(0) + 1, number.indexOf('='));
                    String v2 = number.substring(number.indexOf("=") + 1, number.length());
                    System.out.print(v1 + " ");
                    al.put(v1, v2);

                } else {
                    al.put(number, "");
                    System.out.print(number + " ");
                }
            }


            System.out.println("");
            for (Map.Entry<String, String> set : al.entrySet()) {
                if (set.getKey().equals("obj")) {
                    if (isAllowed(set.getValue())) {
                        alert(Double.parseDouble(set.getValue()));

                    } else
                        alert(set.getValue());
                }
            }
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }

    public static boolean isAllowed(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
