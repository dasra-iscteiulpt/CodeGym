package com.codegym.task.task05.task0526;

/* 
Man and woman

*/

public class Solution {
    public static void main(String[] args) {
        Man m1 = new Man("a", 12, "b");
        Man m2 = new Man("c", 12, "d");
        System.out.println(m1.name + " " + m1.age + " " + m1.address);
        System.out.println(m2.name + " " + m2.age + " " + m2.address);
        Woman w1 = new Woman("a", 12, "b");
        Woman w2 = new Woman("c", 12, "d");
        System.out.println(w1.name + " " + w1.age + " " + w1.address);
        System.out.println(w2.name + " " + w2.age + " " + w2.address);
    }
    public static class Man {
        String name, address;
        int age;

        public Man(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
    }

    public static class Woman {
        String name, address;
        int age;

        public Woman(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
    }
    //write your code here
}
