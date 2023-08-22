package com.manirdev;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double per_KM = 2.20;
        double minPrice = 20;
        double startPrice = 10;
        int distance;
        double total;

        System.out.println("Enter Distance that you want to go as KM: ");
        distance = scan.nextInt();

        total = distance*per_KM + startPrice;
        if (total < minPrice){
            total = minPrice;
            System.out.println("Amount to Pay: " + total);
        }
        System.out.println("Total amount to pay: " + total);
    }
}