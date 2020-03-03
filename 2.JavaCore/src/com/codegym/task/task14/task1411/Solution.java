package com.codegym.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, loser, coder and programmer

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        boolean b = true;

        while (b) {
            String s = reader.readLine();
            if ((s.equals("user"))) {
                Person u = new Person.User();
                doWork(u);
            }
            else if (s.equals("loser")) {
                Person l = new Person.Loser();
                doWork(l);
            }
            else if (s.equals("coder")) {
                Person c = new Person.Coder();
                doWork(c);
            }
            else if (s.equals("programmer")) {
                Person p = new Person.Programmer();
                doWork(p);
            } else {
                b = false;
                break;
            }
        }

    }


    public static void doWork(Person person) {
        if(person instanceof Person.User){
            ((Person.User) person).live();
        }
        if(person instanceof Person.Coder){
           ((Person.Coder) person).writeCode();
        }
        if(person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        }
        if(person instanceof Person.Programmer){
            ((Person.Programmer) person).enjoy();
        }
    }
}
