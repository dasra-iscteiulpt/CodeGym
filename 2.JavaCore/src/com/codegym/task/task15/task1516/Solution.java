package com.codegym.task.task15.task1516;

/* 
Default values

*/

public class Solution {
    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.intVar + " " + s.doubleVar+ " " + s.DoubleVar + " " + s.booleanVar+ " " + s.ObjectVar+ " " + s.ExceptionVar + " " + s.StringVar);
    }
}
