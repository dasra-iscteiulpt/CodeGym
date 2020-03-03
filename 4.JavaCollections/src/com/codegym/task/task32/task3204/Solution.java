package com.codegym.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.util.*;

/* 
Password generator

*/
public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        List<String> charCategories = new ArrayList<>(3);
        charCategories.add(lower);
        charCategories.add(upper);
        charCategories.add(digits);

        StringBuilder password = new StringBuilder(8);
        Random random = new Random(System.nanoTime());
        password.append(lower.charAt(random.nextInt(lower.length())));
        password.append(upper.charAt(random.nextInt(upper.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        //System.out.println(password.toString());
        for (int i = 3; i < 8; i++) {
            String charCategory = charCategories.get(random.nextInt(charCategories.size()));
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
        }


        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] array = password.toString().getBytes();
        for (byte b : array)
            outputStream.write(b);
        return outputStream;
    }
}