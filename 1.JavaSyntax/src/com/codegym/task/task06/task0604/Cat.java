package com.codegym.task.task06.task0604;

/* 
Cat counter

*/

public class Cat {
    public static int catCount = 0;

    //write your code here

    public Cat(){
        catCount++;
    }
    public static void main(String[] args) {

    }
    protected void finalize() throws Throwable {
        catCount--;
    }
}