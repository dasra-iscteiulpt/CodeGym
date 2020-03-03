package com.codegym.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = br.readLine();
            secondFileName = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContents());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContents();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        public String fullFileName;
        public String line2;

        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName=fullFileName;
            this.line2="";
        }

        @Override
        public void run() {
            String line=null;
            String space="";
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fullFileName));
                line = reader.readLine();
                while (line != null) {
                    line2=line2+space+line;
                    line = reader.readLine();
                    space=" ";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String getFileContents() {
            return line2;
        }

    }
}
