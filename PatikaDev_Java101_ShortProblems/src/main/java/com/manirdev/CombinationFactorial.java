package com.manirdev;

import java.util.Scanner;

public class CombinationFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------Combination--------------");
        System.out.println("Enter a number n: ");
        int n = input.nextInt();
        System.out.println("Enter a number r: ");
        int r = input.nextInt();
        int nfact = factorialFunc(n);
        int rfact = factorialFunc(r);
        int diffFact = factorialFunc(n - r);
        double result = 0.0;
        result = (double)nfact/(rfact*diffFact);
        System.out.println("Combination of C("+n+","+r+") is: " + result);
    }
    private static int factorialFunc(int n){
        int result = 1;
        for (int i=1; i<=n; i++){
            result = result * i;
        }
        return result;
    }
}
