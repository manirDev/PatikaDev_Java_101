package com.manirdev;

import java.util.Scanner;

public class AvgOfNumberDivByThreeandFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int sum = 0, counter = 0;
        for(int i=0; i<=n; i++){
            if (i % 3 == 0 && i % 4 == 0){
                sum += i;
                counter++;
            }
        }
        System.out.println("Result: " + (double)sum/counter);
    }
}
