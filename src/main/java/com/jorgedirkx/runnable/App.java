package com.jorgedirkx.runnable;

import java.awt.font.TextHitInfo;

public class App {

    public static void main(String[] args) {
        CharPrinter charPrinter1 = new CharPrinter('*',40);
        CharPrinter charPrinter2 = new CharPrinter('$',45);
        Thread t1 = new Thread(charPrinter1);
        Thread t2 = new Thread(charPrinter2);
        t1.start();
        t2.start();


    }
}
