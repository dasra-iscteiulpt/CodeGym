package com.codegym.task.task12.task1224;

/* 
Unknown animal

*/

import java.io.BufferedReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
       if(o instanceof Cat || o instanceof Tiger|| o instanceof Lion || o instanceof Bull || o instanceof Pig)
        return o.getClass().getSimpleName();
        else
        return "Animal";
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
