package com.codegym.task.task05.task0513;

/* 
Let's put together a rectangle

*/

public class Rectangle {
    public int top;
    public int left;
    public int height;
    public int width;

    public void initialize(int top){
        this.top=top;
        this.left=top;
        this.height=top;
        this.width=top;
    }

    public void initialize(int top,int left){
        this.top=top;
        this.left=left;
        this.height=0;
        this.width=0;
    }
    public void initialize(int top, int left, int width){
        this.top=top;
        this.width=width;
        this.left=left;
        this.height=left;
    }
    public void initialize(int top, int left, int width, int height){
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=height;
    }
    public static void main(String[] args) {

    }
}
