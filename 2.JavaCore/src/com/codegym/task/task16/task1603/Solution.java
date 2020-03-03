package com.codegym.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
A list and some threads

*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {
        SpecialThread st1=new SpecialThread();
        SpecialThread st2=new SpecialThread();
        SpecialThread st3=new SpecialThread();
        SpecialThread st4=new SpecialThread();
        SpecialThread st5=new SpecialThread();
        list.add(new Thread(st1));
        list.add(new Thread(st2));
        list.add(new Thread(st3));
        list.add(new Thread(st4));
        list.add(new Thread(st5));
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("This is the run method inside SpecialThread");
        }
    }
}
