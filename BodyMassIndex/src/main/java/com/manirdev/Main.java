package com.manirdev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       double bodyMassIndex = 0;
       System.out.println("Enter your height in metre: ");
       double height = Double.parseDouble(scan.next());

       System.out.println("Enter your weight in kg: ");
       double weight = Double.parseDouble(scan.next());

       bodyMassIndex = (weight) / (height * height);
       System.out.println("Body Mass index is: " + bodyMassIndex);
    }
}