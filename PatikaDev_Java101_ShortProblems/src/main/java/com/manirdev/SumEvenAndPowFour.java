package com.manirdev;

import java.util.Scanner;

public class SumEvenAndPowFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        boolean isOdd = false;
        while (!isOdd){
            System.out.println("Enter a number: ");
            int n = input.nextInt();
                if (n % 2 != 0){
                isOdd = true;
            }
            if (n % 4 == 0){
                sum += n;
            }
        }
        System.out.println("Result: "+ sum);
    }
}
