package com.codegym.task.task12.task1220;

/* 
Human class and CanRun and CanSwim interfaces

*/

public class Solution {
    public static void main(String[] args) {

    }
    public abstract class Human implements CanRun,CanSwim{

    }
    public interface CanRun{
        public void run();
    }
    public interface CanSwim{
        public void swim();
    }
}

