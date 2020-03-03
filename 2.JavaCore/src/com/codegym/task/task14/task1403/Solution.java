package com.codegym.task.task14.task1403;

/* 
Building and School

*/

public class Solution {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        School s=new School();
        return s;
    }

    public static Building getBuilding() {
        Building b=new Building();
        return b;
    }

    static class School extends Building {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building /*write your code here*/ {
        @Override
        public String toString() {
            return "Building";
        }
    }
}
