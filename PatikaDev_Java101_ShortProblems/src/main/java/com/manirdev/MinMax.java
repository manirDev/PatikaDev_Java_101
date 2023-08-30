package com.manirdev;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.print("How mach number do you want to enter: \n");
        int n = input.nextInt();
        for (int i=0; i<n; i++){
            System.out.print(i+1 + ". Enter number: ");
            int k = input.nextInt();
            if (k < min) min = k;
            if (k > max) max = k;
        }
        System.out.println("Max: " + max + "\nMin: " + min);
    }
}
