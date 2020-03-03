package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String eyeColor;
        private String skinColor;
        private int age;
        private boolean shoes;
        private boolean shirt;
        private boolean jeans;

        public Human(String eyeColor){
            this.eyeColor=eyeColor;
        }
        public Human(String eyeColor, String skinColor){
            this.eyeColor=eyeColor;
            this.skinColor=skinColor;
        }
        public Human(String eyeColor, String skinColor, int age){
            this.eyeColor=eyeColor;
            this.skinColor=skinColor;
            this.age=age;
        }
        public Human(boolean shoes){
            this.shoes=shoes;
        }
        public Human(boolean shoes, boolean shirt){
            this.shoes=shoes;
            this.shirt=shirt;
        }
        public Human(boolean shoes, boolean shirt, boolean jeans){
            this.shoes=shoes;
            this.shirt=shirt;
            this.jeans=jeans;
        }
        public Human(boolean shoes, boolean shirt, boolean jeans,int age){
            this.shoes=shoes;
            this.shirt=shirt;
            this.jeans=jeans;
            this.age=age;
        }
        public Human(boolean shoes, boolean shirt, boolean jeans,int age, String eyeColor){
            this.shoes=shoes;
            this.shirt=shirt;
            this.jeans=jeans;
            this.age=age;
            this.eyeColor=eyeColor;
        }
        public Human(boolean shoes, String skinColor){
            this.shoes=shoes;
            this.skinColor=skinColor;
        }
        public Human(boolean shoes, boolean shirt, String eyeColor){
            this.shoes=shoes;
            this.shirt=shirt;
            this.eyeColor=eyeColor;
        }
    }


}
