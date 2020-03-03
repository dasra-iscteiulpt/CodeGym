package com.codegym.task.task11.task1123;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        int aux=0;
        int x1=array[0],x2=array[0];

        while(aux<array.length) {
            if(array[aux]<x1){
                x1=array[aux];
            }
            if(array[aux]>x2){
                x2=array[aux];
            }
            aux++;
        }
        Pair<Integer, Integer> result = new Pair<Integer, Integer>(x1,x2);
        return result;
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
