package com.codegym.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Tracking changes

*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();
        br.close();
        FileReader reader1 = new FileReader(file1);
        FileReader reader2 = new FileReader(file2);
        ArrayList<String> content1 = new ArrayList<String>();
        ArrayList<String> content2 = new ArrayList<String>();
        String s1 = "", s2 = "";
        int i1 = 0, i2 = 0;
        while (reader1.ready()) {
            int data = reader1.read();
            if (data == 10) {

                content1.add(i1, s1.trim());
                s1 = "";
                i1++;
            } else {
                s1 += (char) data;
                //System.out.println(data);
            }
        }
        reader1.close();
        content1.add(i1, s1);
        while (reader2.ready()) {
            int data = reader2.read();
            if (data == 10) {

                content2.add(i2, s2.trim());
                s2 = "";
                i2++;
            } else {
                s2 += (char) data;
            }
        }
        content2.add(i2, s2);
        reader2.close();

        int i = 0;
        while (content1.size() >= 0 || content2.size() >= 0) {
            if (content1.size() == 0 && content2.size() != 0) {
                lines.add(new LineItem(Type.ADDED, content2.get(i)));
                content2.remove(i);
            } else if (content1.size() != 0 && content2.size() == 0) {
                lines.add(new LineItem(Type.REMOVED, content1.get(i)));
                content1.remove(i);
            } else if (content1.size() == 0 && content2.size() == 0) {
                break;
            } else {
                if (content2.get(i).equals(content1.get(i))) {
                    lines.add(new LineItem(Type.SAME, content2.get(i)));
                    content1.remove(i);
                    content2.remove(i);
                } else {

                    if (content2.get(i).equals(content1.get(i + 1))) {
                        lines.add(new LineItem(Type.REMOVED, content1.get(i)));
                        lines.add(new LineItem(Type.SAME, content2.get(i)));
                        content1.remove(i);
                        content2.remove(i);
                        content1.remove(i);

                    } else {
                        lines.add(new LineItem(Type.ADDED, content2.get(i)));
                        content2.remove(i);
                    }
                }
            }
        }
        for (LineItem lineItem : lines)
            System.out.println(lineItem.type);
    }

    public static enum Type {
        ADDED,        // New line added
        REMOVED,      // Line deleted
        SAME          // No change
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
