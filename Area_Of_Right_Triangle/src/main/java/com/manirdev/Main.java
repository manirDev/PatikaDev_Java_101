package com.manirdev;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter  AB length: ");
        a = scan.nextInt();
        System.out.println("Enter  AC length: ");
        b = scan.nextInt();
        System.out.println("Enter  BC length: ");
        c = scan.nextInt();

        double surface = (double)(a + b + c)/2;
        double area = Math.sqrt(surface*(surface -a )*(surface - b)*(surface - c));

        System.out.println("Surface: " + surface);
        System.out.println("Area: " + area);
    }
}