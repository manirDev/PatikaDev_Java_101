package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int num1, num2, selection =0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        num1 = scan.nextInt();
        System.out.println("Enter number 2: ");
        num2 = scan.nextInt();
        System.out.println("Choose an operation: \n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n5-Mode ");
        selection = scan.nextInt();
        switch (selection) {
            case 1 -> {
                System.out.println("Addition of: " + num1 + " and " + num2 + " is: ");
                System.out.println(num1 + num2);
            }
            case 2 -> {
                System.out.println("Subtraction of: " + num2 + " from " + num1 + " is: ");
                System.out.println(num1 - num2);
            }
            case 3 -> {
                System.out.println("Multiplication of: " + num1 + " and " + num2 + " is: ");
                System.out.println(num1 * num2);
            }
            case 4 -> {
                System.out.println("Division of: " + num1 + " by " + num2 + " is: ");
                System.out.println(num1 / num2);
            }
            case 5 -> {
                System.out.println("Mode of: " + num1 + " by " + num2 + " is: ");
                System.out.println(num1 % num2);
            }
            default -> {
                System.out.println("------------------Error--------------------");
            }
        }
    }
}