package com.codegym.task.task05.task0517;

/* 
Creating cats

*/

public class Cat {
    public String name,address,color;
    public int weight, age;

    public Cat(String name){
        this.name=name;
        this.color="red";
        this.age=3;
        this.weight=10;
    }

    public Cat(String name, int weight, int age){
        this.name=name;
        this.color="red";
        this.age=age;
        this.weight=weight;
    }

    public Cat(String name, int age){
        this.name=name;
        this.color="red";
        this.age=age;
        this.weight=3;
    }

    public Cat(int weight, String color){
        this.color=color;
        this.age=3;
        this.weight=weight;
    }

    public Cat(int weight, String color, String address){
        this.address=address;
        this.color=color;
        this.age=3;
        this.weight=weight;
    }
    public static void main(String[] args) {

    }
}
