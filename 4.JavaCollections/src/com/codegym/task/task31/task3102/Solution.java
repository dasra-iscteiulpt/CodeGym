package com.codegym.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* 
Find all the files

*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        Queue<File> queue = new LinkedList<>();
        ArrayList<String> files = new ArrayList<>();
        queue.add(new File(root));
        while (!queue.isEmpty()) {
            File curr = queue.poll();
            File[] currFiles = curr.listFiles();
            if (currFiles != null) {
                for (File f : currFiles) {
                    if (f.isDirectory()) {
                        queue.add(f);
                    } else {
                        files.add(f.getAbsolutePath());
                        System.out.println(f.getAbsolutePath());

                    }
                }
            }
        }
        return files;
    }

    public static void main(String[] args) throws IOException {
        getFileTree("C://Users//Diana Salvador//Desktop//test");
    }
}