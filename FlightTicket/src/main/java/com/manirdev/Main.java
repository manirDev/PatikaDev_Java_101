package com.manirdev;


import java.util.Scanner;

public class Main {
    static final double pricePerKM = 0.10;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distance;
        int age;
        //one-way, ....
        int tripType;
        double totalPrice = 0.0;
        double discountedPrice = 0.0;
        double ageDiscount = 0.0;
        double doubleWays = 0.0;

        System.out.println("Enter distance to travel");
        distance = input.nextDouble();
        System.out.println("Enter traveller's age : ");
        age = input.nextInt();
        System.out.println("Choose trip ways : \n1-ONE WAY\n2-TWO WAYS");
        tripType = input.nextInt();
        if (distance < 0 || age < 0 || (tripType != 1 && tripType != 2)){
            System.out.println("------------Invalid information-----------");
        }
        else{
            System.out.println("Distance : " + distance);
            System.out.println("Age : " + age);
            totalPrice = distance * pricePerKM;
            System.out.println("Total Price without discount: " + totalPrice);
            if (age < 12){
                ageDiscount =  (totalPrice * 0.50);
                System.out.println("Age Discount : " + ageDiscount);
            }
            else if ( age <= 24){
                ageDiscount =  (totalPrice * 0.10);
                System.out.println("Age Discount : " + ageDiscount);
            }
            else if (age > 65){
                ageDiscount =  (totalPrice * 0.30);
                System.out.println("Age Discount : " + ageDiscount);
            }
            discountedPrice = totalPrice - ageDiscount;
            if (tripType == 2){
                doubleWays = (discountedPrice * 0.20);
                System.out.println("Double ways discount: " + doubleWays);
                totalPrice = (discountedPrice - doubleWays)  * tripType;
                System.out.printf("Total Price After Discount: " + totalPrice);
            }
            if (tripType == 1){
                totalPrice = discountedPrice;
                System.out.printf("Total Price After Discount: " + totalPrice);
            }
        }

    }
}