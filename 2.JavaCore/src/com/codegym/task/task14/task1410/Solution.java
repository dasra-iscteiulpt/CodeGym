package com.codegym.task.task14.task1410;

/* 
Wine tasting

*/

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getCelebrationName());
        System.out.println(getBubblyWine().getCelebrationName());
        System.out.println(getWine().getCelebrationName());
    }

    public static Drink getDeliciousDrink() {
        Drink d = new Wine();
        return d;
    }

    public static Wine getWine() {
        Wine d = new Wine();
        return d;
    }

    public static Wine getBubblyWine() {
        Wine d = new BubblyWine();
        return d;
    }
}
