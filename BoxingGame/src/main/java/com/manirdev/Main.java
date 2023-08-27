package com.manirdev;


public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Elon" , 10 , 95, 90, 0);
        Fighter alex = new Fighter("Mark" , 5 , 95, 100, 0);
        Ring r = new Ring(marc,alex , 80 , 100);
        r.run();
    }
}