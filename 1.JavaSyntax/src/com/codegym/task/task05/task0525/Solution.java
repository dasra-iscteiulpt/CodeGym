package com.codegym.task.task05.task0525;

/* 
The whole duck isn't enough

*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);
        Dog dog1= new Dog();
        System.out.println(dog1);
        Dog dog2= new Dog();
        System.out.println(dog2);
        Cat cat1=new Cat();
        System.out.println(cat1);
        Cat cat2=new Cat();
        System.out.println(cat2);
        //write your code here
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }

    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }
    //write your code here
}
