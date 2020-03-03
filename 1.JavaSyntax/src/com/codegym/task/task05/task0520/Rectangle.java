package com.codegym.task.task05.task0520;

/* 
Create a Rectangle class

*/


public class Rectangle {
    public int top;
    public int left;
    public int height;
    public int width;

    public Rectangle(int top){
        this.top=top;
        this.left=top;
        this.height=top;
        this.width=top;
    }

    public Rectangle(int top,int left){
        this.top=top;
        this.left=left;
        this.height=0;
        this.width=0;
    }
    public Rectangle(int top, int left, int width){
        this.top=top;
        this.width=width;
        this.left=left;
        this.height=left;
    }
    public Rectangle(int top, int left, int width, int height){
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=height;
    }
    public static void main(String[] args) {

    }
}
