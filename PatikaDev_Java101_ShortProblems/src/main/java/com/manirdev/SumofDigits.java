package com.manirdev;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
