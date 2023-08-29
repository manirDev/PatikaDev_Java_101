package com.manirdev;

import java.util.Scanner;

public class Functions {
    static Scanner input = new Scanner(System.in);
    void addition() {
        int number, result = 0, i = 1;
        while(true){
            System.out.println(i++ + ". number: ");
            number = input.nextInt();
            if (number == 0) break;
            result += number;
        }
        System.out.println("Result : " + result);
    }
    void subtraction() {
        System.out.print("How much number do you want enter : ");
        int counter = input.nextInt();
        int number, result = 0;
        for (int i=1; i<=counter; i++){
            System.out.println(i + ". number: ");
            number = input.nextInt();
            if (i == 1){
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Result: " + result);
    }
    void multiplication() {
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number :");
            number = input.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    void division() {
        System.out.print("How much number do you want enter :");
        int counter = input.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = input.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You can not enter 0 as dividend.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }
    void power() {
        System.out.print("Enter the base :");
        int base = input.nextInt();
        System.out.print("Enter the exponent :");
        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }
    void factorial() {
        System.out.print("Enter a number :");
        int n = input.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }
    void mode() {
        System.out.println("Enter the first number");
        int number = input.nextInt();
        System.out.println("Enter the second number");
        int mod = input.nextInt();
        System.out.println("Result :" + number % mod);
    }
    void areaAndPerimeter() {
        System.out.println("Enter width of the rectangle");
        int a = input.nextInt();
        System.out.println("Enter height of the rectangle");
        int b = input.nextInt();
        System.out.println("Perimeter : " + (a+b)*2);
        System.out.println("Area: " + a*b);
    }
}
