package com.manirdev;

public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("**************Square******************");
        square(n);
        System.out.println("**************Triangle******************");
        triangle(n);
        triangle1(n);
        triangle2(n);
        System.out.println("**************Pyramid******************");
        pyramid(n);
        System.out.println("**************Reverse Pyramid******************");
        reversePyramid(n);
    }
    private static void square(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    private static void triangle(int n){
        for (int i=0; i<=n; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    private static void triangle1(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.print(j+1 + "\t");
            }
            System.out.println();
        }
    }
    private static void triangle2(int n){
        for (int i=1; i<=n; i++){
            for (int j=0; j<(n-i+1); j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    private static void pyramid(int n){
        for (int i=0; i<n; i++){
            //space
            for (int j=0; j<(n-i-1); j++){
                System.out.print(" ");
            }
            for (int j=0; j<(2*i+1); j++){
                System.out.print("*");
            }
            for (int j=0; j<(n-i-1); j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    private static void reversePyramid(int n){
        for (int i=0; i<n; i++){
            //space
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            for (int j=0; j< 2*n - (2*i+1); j++){
                System.out.print("*");
            }
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
