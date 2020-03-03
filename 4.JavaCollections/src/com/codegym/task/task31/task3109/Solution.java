package com.codegym.task.task31.task3109;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Properties;

/* 
Reading config files

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        Properties properties = solution.getProperties("4.JavaCollections/src/com/codegym/task/task31/task3109/properties.xml");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/codegym/task/task31/task3109/properties.txt");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/codegym/task/task31/task3109/notExists");
        properties.list(System.out);
    }

    public Properties getProperties(String fileName) throws IOException {
        File file = new File(fileName);
        Properties prop = new Properties();

        if (fileName.endsWith(".xml")) {
            try {
                prop.loadFromXML(new FileInputStream(file));
                return prop;
            } catch (Exception e) {
                return prop;
            }
        } else {
            try {
                prop.load(new FileReader(file));
                return prop;
            } catch (Exception e) {
                return prop;
            }
        }
    }
}
