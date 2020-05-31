package com.company;

public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
       if(instance == null) {
           instance = new Singleton();
       }
        System.out.println("Called Singleton Instance");
       return instance;
    }
}
