package com.codegym.task.task05.task0503;


/* 
Getters and setters for the Dog class

*/

public class Dog {
    //write your code here
    public int age;
    public String name;

    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.setName("Ulisses");
        dog1.setAge(2);
        System.out.println("Name: "+ dog1.getName() + " Age: " + dog1.getAge());
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
}
