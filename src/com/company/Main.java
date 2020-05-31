package com.company;

class MyThread extends Thread {
    void hello(){
        System.out.println("hello ===");
    }
    @Override
    public void run() {
        for(int i = 0 ; i < 10 ; i ++){
            System.out.println(i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}



public class Main {

    public static void main(String[] args) {
	// write your code here
        // Thread is execution context :- code in sequence executed
        new Thread(new MyThread()).start();
        new MyThread().hello();
        new MyThread().setDaemon(true);
        System.out.println("Hello Thread");
        ((Runnable) () -> {
            for (int i = 20; i < 30; i++) {
                System.out.println(i);
            }
        }).run();

    }
}
