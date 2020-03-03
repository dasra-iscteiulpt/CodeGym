package com.codegym.task.task14.task1421;

public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance(){
        return instance;
    }

    private Singleton(Singleton singleton){

    }

}
