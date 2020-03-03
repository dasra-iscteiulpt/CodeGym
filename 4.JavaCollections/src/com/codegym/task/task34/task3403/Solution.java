package com.codegym.task.task34.task3403;

/* 
Factorization using recursion

*/
public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.recurse(132);
    }

    public void recurse(int n) {
        int a = 2;
        while (a <= n) {
            if ((n % a) == 0) {
                if (a != n) {
                    System.out.print(a + " ");
                    recurse(n / a);
                } else {
                    System.out.print(a);
                }
                return;
            }
            a++;
        }
    }
}