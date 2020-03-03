package com.codegym.task.task31.task3101;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/*
Iterating through a file tree

*/
public class Solution {

    public static void writeResult(String path, String resultFileAbsolutePath) throws IOException {
        File oldFile = new File(resultFileAbsolutePath);
        File newfile = new File(oldFile.getParent() + "\\allFilesContent.txt");
        if (FileUtils.isExist(oldFile))
            FileUtils.renameFile(oldFile, newfile);
        Queue<File> queue = new LinkedList<>();
        ArrayList<File> files = new ArrayList<>();
        queue.add(new File(path));
        while (!queue.isEmpty()) {
            File curr = queue.poll();
            File[] currFiles = curr.listFiles();
            if (currFiles != null) {
                for (File f : currFiles) {
                    if (f.isDirectory()) {
                        queue.add(f);
                    } else {
                        if (f.isFile() && f.length() <= 50) {
                            files.add(new File(f.getAbsolutePath()));
                        }
                    }
                }
            }
        }
        Collections.sort(files, new CompareFileName());

        FileOutputStream fileOutputStream = new FileOutputStream(newfile);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
        BufferedReader reader = null;
        for (File f : files) {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            while (reader.ready()) {
                writer.write(reader.readLine());
                writer.flush();
            }
            writer.write("\n"); // After the body of each file, write "\n".
        }
        writer.close();
        fileOutputStream.close();
        reader.close();
    }

    static class CompareFileName implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return ((File) o1).getName().compareTo(((File) o2).getName());
        }
    }

    public static void main(String[] args) throws IOException {
        String path = args[0];
        String resultFileAbsolutePath = args[1];
        writeResult(path, resultFileAbsolutePath);

    }
}