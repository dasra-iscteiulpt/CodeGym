package com.codegym.task.task07.task0724;

/* 
Family census

*/

public class Solution {


    public static void main(String[] args) {
        Human gm1 = new Human("gm1", true, 20);
        Human gm2 = new Human("gm2", true, 30);
        Human gf1 = new Human("gf1", false, 40);
        Human gf2 = new Human("gf2", false, 50);
        Human h5 = new Human("5", false, 10, gf1, gm1);
        Human h6 = new Human("6", false, 10, gf2, gm2);
        Human h7 = new Human("7", true, 20, h5, h6);
        Human h8 = new Human("8", false, 30, h5,h6);
        Human h9 = new Human("9", true, 40, h5,h6);

        System.out.println(gm1.toString());
        System.out.println(gm2.toString());
        System.out.println(gf1.toString());
        System.out.println(gf2.toString());
        System.out.println(h5.toString());
        System.out.println(h6.toString());
        System.out.println(h7.toString());
        System.out.println(h8.toString());
        System.out.println(h9.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        public Human(String name, boolean sex, int age){
                this.name=name;
                this.sex=sex;
                this.age=age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }
        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}