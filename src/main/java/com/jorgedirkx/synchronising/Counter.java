package com.jorgedirkx.synchronising;

//synchronising of threads is neccesary when using the same source or threads are dependent from each other.

public class Counter {

    private int count=0;

    public synchronized void increment(){
        count++;
    }

    public synchronized void decrement(){
        count--;
    }

    public int getCount() {
        return count;
    }
}
