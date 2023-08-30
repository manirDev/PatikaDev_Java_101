package com.manirdev;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Fibo of " + n + " is: " + helper(n));
    }
    private static int helper(int n){
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        return helper(n-1) + helper(n - 2);
    }
}
