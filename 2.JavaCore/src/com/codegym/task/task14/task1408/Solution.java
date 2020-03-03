package com.codegym.task.task14.task1408;

/* 
Chicken factory

*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        hen.getMonthlyEggCount();
        //System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String continent) {
            if(continent.equals(Continent.AFRICA)) {
                Hen aH = new AfricanHen();
                return aH;
            }
            else if(continent.equals(Continent.ASIA)) {
                Hen aH = new AsianHen();
                return aH;
            }
            else if(continent.equals(Continent.NORTHAMERICA)){
                Hen aH = new NorthAmericanHen();
                return aH;
            }
            else if(continent.equals(Continent.EUROPE)){
                Hen aH = new EuropeanHen();
                return aH;
            }
            else
                return null;
        }
    }


}
