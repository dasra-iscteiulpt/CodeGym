package com.codegym.task.task05.task0502;

/* 
Implement the fight method

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int score1=this.age + this.weight + this.strength;
        int score2=anotherCat.age+anotherCat.weight+anotherCat.strength;

        if(score1>score2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Cat cat1=new Cat();
        Cat cat2=new Cat();

        cat1.age=1;
        cat1.strength=20;
        cat1.weight=5;
        cat2.age=3;
        cat2.strength=15;
        cat2.weight=6;
    }
}
