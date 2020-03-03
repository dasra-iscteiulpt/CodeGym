package com.codegym.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;

/* 
Currencies

*/

public class Solution {


    public static void main(String[] args) {
        Person paul = new Person("Paul");
        for (Money money : paul.getAllMoney()) {
            System.out.println(paul.name + " has a stash of " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            //write your code here
        }

        private List<Money> allMoney;


        public List<Money> getAllMoney() {
            Money m1=new Euro(300) ;
            Money m2=new USD(400) ;
            Money m3=new Ruble(670) ;
            allMoney.add(m1);
            allMoney.add(m2);
            allMoney.add(m3);
            return allMoney;
        }
    }
}
