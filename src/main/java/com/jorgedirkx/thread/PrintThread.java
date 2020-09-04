package com.jorgedirkx.thread;

public class PrintThread extends Thread{

    private char c;
    private int count;

    public PrintThread(char c, int count){
        this.count =count;
        this.c=c;
    }

    public void run(){
        for(int i=0; i<count;i++){
            System.out.println(c);
        }
    }
}
