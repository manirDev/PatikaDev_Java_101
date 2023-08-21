package org.example;

import java.util.Scanner;

/*
 VAT(Value Added Tax) calculator
* */
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int price;
        System.out.println("Enter the amount of the money: ");
        price = scan.nextInt();
        double VATRate = 0.18;
        double priceWithVAT = price + price*VATRate;
        double VATAmount = priceWithVAT - price;
        System.out.println("Price without VAT:  "+ price);
        System.out.println("VAT Rate: "+ VATRate);
        System.out.println("Price with VAT: "+ priceWithVAT);
        System.out.println("VAT amount: " + VATAmount);
    }
}