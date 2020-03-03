package com.codegym.task.task04.task0404;

/* 
Cat register

*/

public class Cat {
    private static int catCount = 0;

    public static void addNewCat() {
        Cat.catCount=Cat.catCount+1;//write your code here
    }

    public static void main(String[] args) {
        addNewCat();
        addNewCat();

    }
}
