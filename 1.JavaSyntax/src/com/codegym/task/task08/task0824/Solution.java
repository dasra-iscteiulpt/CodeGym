package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Human c1=new Human();
        c1.age=10; c1.name="c1"; c1.sex=true;c1.children=new ArrayList<Human>();
        System.out.println(c1.toString());
        Human c2=new Human();
        c2.age=10; c2.name="c2"; c2.sex=true;c2.children=new ArrayList<Human>();
        System.out.println(c2.toString());
        Human c3=new Human();
        c3.age=10; c3.name="c3"; c3.sex=true;c3.children=new ArrayList<Human>();
        System.out.println(c3.toString());
        Human f=new Human();
        f.age=40; f.name="f"; f.sex=false;f.children= new ArrayList<Human>(Arrays.asList(c1,c2,c3));
        System.out.println(f.toString());
        Human m=new Human();
        m.age=70; m.name="m"; m.sex=true;m.children= new ArrayList<Human>(Arrays.asList(c1,c2,c3));
        System.out.println(m.toString());
        Human gm1=new Human();
        gm1.age=70; gm1.name="gm1"; gm1.sex=true;gm1.children= new ArrayList<Human>(Arrays.asList(f));
        System.out.println(gm1.toString());
        Human gm2=new Human();
        gm2.age=70; gm2.name="gm2"; gm2.sex=true;gm2.children= new ArrayList<Human>(Arrays.asList(f));
        System.out.println(gm2.toString());
        Human gf1=new Human();
        gf1.age=70; gf1.name="gf1"; gf1.sex=false;gf1.children= new ArrayList<Human>(Arrays.asList(m));
        System.out.println(gf1.toString());
        Human gf2=new Human();
        gf2.age=70; gf2.name="gf1"; gf2.sex=false;gf2.children= new ArrayList<Human>(Arrays.asList(m));
        System.out.println(gf2.toString());

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
