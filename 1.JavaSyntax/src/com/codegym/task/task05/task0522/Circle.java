package com.codegym.task.task05.task0522;

/* 
Max constructors

*/

public class Circle {
    public double x;
    public double y;
    public double radius;
    public int size;

    public Circle(double x, double y, double radius) {
        this.x=x;
        this.x=y;
        this.radius=radius;
    }
    public Circle(double x, double y) {
        this.x=x;
        this.x=y;
    }
    public Circle(double x) {
        this.x=x;
    }
    public Circle(double x, int size) {
        this.x=x;
        this.size=size;
    }

    public Circle(){

    }
    public static void main(String[] args) {

    }
}