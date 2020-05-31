package com.company;

public class RunnableThread {
    public static void main(String args[]) {
        // Runnable Thread with anonymous class
      Thread t1 = new Thread(()->{for (int i = 0; i < 10; i++) System.out.println("Hello Friend" + i);});
       t1.start();
       Singleton.getInstance();

       Runnable runnable = () -> {
           System.out.println("I am running in" + Thread.currentThread().getName());
       };
       Thread t2 = new Thread(runnable);
       t2.setName("hello");
       t2.start();
    }
}
