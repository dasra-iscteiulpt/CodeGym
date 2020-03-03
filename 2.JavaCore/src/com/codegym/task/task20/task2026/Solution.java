package com.codegym.task.task20.task2026;

/* 
Rectangle algorithms

*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };
        byte[][] a3 = new byte[][]{
                {1,1,0,0,0,0,1,1,1},
                {1,1,0,0,0,0,1,1,1},
                {0,0,0,0,0,0,0,0,0},
                {1,1,1,1,1,1,1,0,0},
                {1,1,1,1,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,1},
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Must be 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Must be 4");
        int count3 = getRectangleCount(a3);
        System.out.println("count = " + count3 + ". Must be 4");
    }

    public static int getRectangleCount(byte[][] a) {
        int rect = 0;
        for (int i = 0; i < a.length; i++) {
            for (int y = 0; y < a[i].length; y++) {
                if (a[i][y] == 1) {
                    int m = findX(y, i, a);
                    int n = findY(y, i, a);
                    for(int c=i; c<=n+i; c++){
                        for(int r=y; r<=m+y; r++){
                            a[c][r] = 0;
                        }
                    }
                    rect++;
                }
            }

        }
        return rect;
    }

    public static int findX(int x, int y, byte[][] a) {
        int count = -1;
        for (int i = x; i < a[0].length; i++) {
            if (a[y][i] == 1) count++;
            else break;
        }
        return count;
    }

    public static int findY(int x, int y, byte[][] a) {
        int count = -1;
        for (int i = y; i < a.length; i++) {
            if (a[i][x] == 1) count++;
            else break;
        }
        return count;
    }
}
