package com.codegym.task.task04.task0411;

/* 
Seasons on Terra

*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        if(month==12|month==1|month==2)//write your code here
            System.out.println("winter");
        if(month==3|month==4|month==5)//write your code here
            System.out.println("spring");
        if(month==6|month==7|month==8)//write your code here
            System.out.println("summer");
        if(month==9|month==10|month==11)//write your code here
            System.out.println("autumn");
    }
}