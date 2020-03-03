package com.codegym.task.task18.task1817;

/* 
Spaces

*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputstream = new FileInputStream(args[0]);
        int n2 = 0, n1 = 0;
        double val = 0;
        while (inputstream.available() > 0) {
            int data = inputstream.read();
            //System.out.println(data);
            if (data == 32)
                n2++;
            n1++;
        }
        inputstream.close();
        BigDecimal bd = BigDecimal.valueOf((double) n2 / n1 * 100);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        System.out.println(bd);
    }
}
