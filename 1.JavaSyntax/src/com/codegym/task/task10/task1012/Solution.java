package com.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Number of letters

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        int aux = 0;
        int aux2=0;
        for (Character c : alphabet) {
            for (String s : list) {
                    for(int i = 0;i<s.length();i++) {
                        if(s.charAt(i)==c) {
                           // System.out.println(" hi");
                            aux++;
                        }

                    }
            }
            System.out.println(c + " " +aux);
            aux=0;
        }
    }
}
