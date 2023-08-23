package com.manirdev;
import java.util.Scanner;

public class Main {
    public static final double PI = 3.14;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int radius;
        double area, perimeter, semiArea, alpha;
        System.out.println("Enter radius of the circle");
        radius = scan.nextInt();

        System.out.println("Enter angle alpha of the circle");
        alpha = scan.nextDouble();

        area = PI * radius * radius;
        perimeter = 2 * PI * radius;

        System.out.println("Area of the circle is: " + area);
        System.out.println("Perimeter of the circle is : " + perimeter);

        semiArea = (PI * (radius * radius) * alpha) / 360;
        System.out.println("Area of the section with given alpha is: " + semiArea);
    }
}