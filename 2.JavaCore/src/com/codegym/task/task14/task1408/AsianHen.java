package com.codegym.task.task14.task1408;

public class AsianHen extends Hen {
    @Override
    int getMonthlyEggCount() {
        return 4;
    }
    public String getDescription(){
        String s=super.getDescription() + " I come from " + Continent.ASIA +". I lay "+ getMonthlyEggCount() +" eggs a month.";
        return s;
    }
}