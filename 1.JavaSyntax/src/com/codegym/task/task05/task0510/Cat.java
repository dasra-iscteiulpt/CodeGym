package com.codegym.task.task05.task0510;

/* 
Initializing cats

*/

public class Cat {
    public String name;
    public int age;
    public String color;
    public int weight;
    public String address;

    public void initialize(String name){
        this.name=name;
        this.age=3;
        this.color="blue";
        this.weight=10;
    }
    public void initialize(String name, int weight, int age){
        this.name=name;
        this.age=age;
        this.color="blue";
        this.weight=weight;
    }
    public void initialize(String name, int weight){
        this.name=name;
        this.age=2;
        this.color="blue";
        this.weight=weight;
    }
    public void initialize(int weight, String color){
        this.age=3;
        this.color=color;
        this.weight=weight;
    }

    public void initialize(int weight, String color, String address){
        this.age=2;
        this.color=color;
        this.weight=weight;
        this.address=address;
    }

    public static void main(String[] args) {

    }
}
