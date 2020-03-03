package com.codegym.task.task20.task2003;


import java.io.*;
import java.util.*;

/* 
Introducing properties

*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        br.close();
        FileInputStream fis = new FileInputStream(name);
        load(fis);
        fis.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties properties = new Properties();
        for (Map.Entry<String, String> entry : Solution.properties.entrySet()) {
            properties.put(entry.getKey(), entry.getValue());
        }
        properties.store(outputStream, null);
    }

    public void load(InputStream inputStream) throws Exception {
        Properties properties = new Properties();
        properties.load(inputStream);
        Iterator hmIterator = properties.entrySet().iterator();
        String key;
        String value;
        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) hmIterator.next();
            key = (String) mapElement.getKey();
            value = properties.getProperty(key);
            Solution.properties.put(key, value);
        }
    }

    public static void main(String[] args) throws Exception {
        Solution s = new Solution();
        s.fillInPropertiesMap();

        OutputStream outputStream = new FileOutputStream("C:/Users/Diana Salvador/Desktop/test1.txt");

        s.save(outputStream);
        outputStream.close();
    }
}
