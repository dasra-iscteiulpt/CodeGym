package com.codegym.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        Thread t1 = new Thread(new thread1());
        Thread t2 = new Thread(new thread2());
        Thread t3 = new Thread(new thread3());
        thread4 t4 = new thread4();
        Thread t5 = new Thread(new thread5());

        threads.add(t1);
        threads.add(t2);
        threads.add(t3);
        threads.add(t4);
        threads.add(t5);
    }

    public static class thread1 implements Runnable {

        @Override
        public void run() {
            while (true) ;
        }
    }

    public static class thread2 implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
                ;
            }
        }
    }

    public static class thread3 implements Runnable {
        @Override
        public void run() {
            try {
                while (!Thread.interrupted()) {
                    System.out.println("Hurray");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                //System.out.println("InterruptedException");
            }
        }
    }

    public static class thread4 extends Thread implements Message {
        @Override
        public void run() {
            while (isAlive()) {
               // showWarning();
            }
        }

        @Override
        public void showWarning() {
            this.stop();
        }
    }

    public static class thread5 implements Runnable {
        @Override
        public void run() {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int aux = 0;
            while (true) {
                try {
                    String s = br.readLine();
                    if (s.equals("N")) {
                        break;
                    } else {
                        aux += Integer.parseInt(s);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(aux);
        }

        public static void main(String[] args) {
            threads.get(0).start();
        }
    }
}