package com.manirdev;

import java.util.Scanner;

public class Main {

    //Standard Price Per KM for each Grocery
    static final Double pear = 2.14;
    static final Double apple = 3.67;
    static final Double tomato = 1.11;
    static final Double aubergine  = 2.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalKG = 0;
        double totalPrice = 0;

        System.out.print("Pear KG : ");
        double pearKG = scanner.nextDouble();

        System.out.print("Apple KG : ");
        double appleKG = scanner.nextDouble();

        System.out.print("Tomato KG : ");
        double tomatoKG = scanner.nextDouble();

        System.out.print("Aubergine KG : ");
        double aubergineKG = scanner.nextDouble();

        totalKG = pearKG + appleKG + tomatoKG + aubergineKG;
        totalPrice = pear*pearKG + apple*appleKG + tomato*tomatoKG + aubergine*aubergineKG;

        System.out.println("Total KG : " + totalKG);
        System.out.println("Total Price : " + totalPrice);
    }
}