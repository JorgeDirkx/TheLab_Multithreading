package com.jorgedirkx.thread;

public class App {

    public static void main(String[] args) {
        PrintThread thread1 = new PrintThread('*', 40);
        PrintThread thread2 = new PrintThread('$', 40);
        thread1.start();
        thread2.start();
    }
}
