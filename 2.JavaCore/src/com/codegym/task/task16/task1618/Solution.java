package com.codegym.task.task16.task1618;

/* 
Another interruption

*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread t=new TestThread();
        t.start();
        Thread.sleep(1000);
        t.interrupt();
    }

    //write your code here
    public static class TestThread extends Thread{
        @Override
        public void run() {

        }
    }
}