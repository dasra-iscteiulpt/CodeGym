package com.codegym.task.task14.task1408;

public class EuropeanHen extends Hen {
    @Override
    int getMonthlyEggCount() {
        return 2;
    }
    public String getDescription(){
        String s=super.getDescription() + " I come from " + Continent.EUROPE +". I lay "+ getMonthlyEggCount() +" eggs a month.";
        return s;
    }
}

