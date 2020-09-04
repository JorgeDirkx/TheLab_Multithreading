package com.jorgedirkx.runnable;

public class CharPrinter implements Runnable {

    private char c;
    private int count;

    public CharPrinter(char c, int count){
        this.c= c;
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0; i<count;i++){
            System.out.println(c);
        }

    }
}
