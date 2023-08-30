package com.manirdev;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        for (int i=1; i<=n; i++){
            helper(i);
        }
    }
    private static void helper(int i){
        int counter = 0;
        for (int j=1; j<=i; j++){
            if (i % j == 0){
               counter++;
            }
        }
        if (counter == 2){
            System.out.print(i + "\t");
        }
    }
}
