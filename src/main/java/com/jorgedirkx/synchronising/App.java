package com.jorgedirkx.synchronising;

public class App {

    public static void main(String[] args) throws Exception {

        Counter counter = new Counter();
        Thread thread1 = new Thread(()->increment(counter,10));
        Thread thread2 = new Thread(()->increment(counter, 20));

        thread1.start();
        thread2.start();


        //using join method: waiting for both threads have finished, then print
        thread1.join();
        thread2.join();

        System.out.println(counter.getCount());
    }

    public static void increment(Counter counter, int number){
        for(int i=0;i<number;i++){
            counter.increment();
        }
    }
}
