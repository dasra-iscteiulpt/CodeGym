package com.codegym.task.task04.task0405;

/* 
Setting the number of cats

*/

public class Cat {
    private static int catCount = 0;

    public static void setCatCount(int catCount) {
        Cat.catCount=catCount;//write your code here
    }

    public static void main(String[] args) {
        setCatCount(4);
    }
}
