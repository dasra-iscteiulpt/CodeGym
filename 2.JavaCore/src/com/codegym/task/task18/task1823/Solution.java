package com.codegym.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
Threads and bytes

*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s.equals("exit")) {
                br.close();
                break;
            }
            ReadThread rt = new ReadThread(s);
            rt.start();
            //resultMap.put(s, rt.freqFinder());

        }
        br.close();
    }

    public static class ReadThread extends Thread {
        private String filename;

        public ReadThread(String fileName) {
            this.filename = fileName;
        }

        public void run() {
            FileInputStream inputStream1 = null;
            TreeMap<Integer, Integer> sorted = new TreeMap<>();
            HashMap<Integer, Integer> hash = new HashMap<>();
            ArrayList<Integer> al = null;
            int i = 0;
            try {
                inputStream1 = new FileInputStream(filename);
                al = new ArrayList<Integer>();
                while (inputStream1.available() > 0) {
                    int data = inputStream1.read();
                    al.add(data);
                    //System.out.println("data: " + data);
                }
                inputStream1.close();
                for (Integer bytes : al) {
                    if (!hash.keySet().contains(bytes)) {
                        int count = Collections.frequency(al, bytes);
                        hash.put(bytes, count);
                        //System.out.println(bytes + " frequency: " + count);
                    }
                }
                sorted.putAll(hash);
                int max = sorted.values().stream().max(Integer::compare).get();

                for (Map.Entry<Integer, Integer> entry : sorted.entrySet()) {
                    if (entry.getValue().equals(max)) {
                        i = entry.getKey();
                    }
                }
                synchronized (resultMap){
                    resultMap.put(filename,i);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        /*public int freqFinder() throws IOException {
            FileInputStream inputStream1 = new FileInputStream(filename);
            TreeMap<Integer, Integer> sorted = new TreeMap<>();
            HashMap<Integer, Integer> hash = new HashMap<>();
            ArrayList<Integer> al = null;
            int i = 0;
            al = new ArrayList<Integer>();
            while (inputStream1.available() > 0) {
                int data = inputStream1.read();
                al.add(data);
                //System.out.println("data: " + data);
            }
            inputStream1.close();
            for (Integer bytes : al) {
                if (!hash.keySet().contains(bytes)) {
                    int count = Collections.frequency(al, bytes);
                    hash.put(bytes, count);
                    //System.out.println(bytes + " frequency: " + count);
                }
            }
            sorted.putAll(hash);
            int max = sorted.values().stream().max(Integer::compare).get();

            for (Map.Entry<Integer, Integer> entry : sorted.entrySet()) {
                if (entry.getValue().equals(max)) {
                    i = entry.getKey();
                }
            }
            return i;
        }*/
    }
}


