package com.codegym.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Functionality is not enough!

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> hm=new HashMap<String, Integer>();
        boolean b=true;
        while(b) {
            try {
                Integer id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                hm.put(name,id);
            }
            catch(NumberFormatException e){
                b=false;
                break;
            }

        }
        Iterator it = hm.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getValue() + " " + pair.getKey());
        }

    }
}
