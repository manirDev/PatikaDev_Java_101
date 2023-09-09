package com.manirdev;

public class PatternProblems {
    public static void main(String[] args) {
        System.out.println("-------------Square---------------");
        square(4);
        System.out.println("-------------RightAngleTriangleAtLeft---------------");
        rightAngleTriangleAtLeft(5);
        System.out.println("-------------RightAngleTriangleAtLeft---------------");
        reverseRightAngleTriangleAtLeft(5);
        System.out.println("-------------RightAngleTriangleAtRight---------------");
        rightAngleTriangleAtRight(5);
        System.out.println("-------------Pyramid---------------");
        pyramid(5);
        System.out.println("------------Reverse Pyramid---------------");
        reversePyramid(5);
        System.out.println("------------Diamond---------------");
        diamond(5);
        System.out.println("------------Right Sided Pyramid---------------");
        rightSidedPyramid(5);
        System.out.println("------------Left Sided Pyramid---------------");
        leftSidedPyramid(5);
        System.out.println("------------Left and Right Sided Pyramid---------------");
        leftAndRightSidedPyramid(5);
        System.out.println("------------Squared Diamond---------------");
        squaredDiamond(5);
        System.out.println("------------Empty Square---------------");
        emptySquare(5);
        System.out.println("------------Squared Numbers---------------");
        squaredNumbers(4);
    }
    private static void square(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void rightAngleTriangleAtLeft(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void reverseRightAngleTriangleAtLeft(int n){
        for (int i=1; i<=n; i++){
            for (int j=i; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void rightAngleTriangleAtRight(int n){
        for (int i=1; i<=n; i++){
            for (int j=i; j<n; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pyramid(int n){
        for (int i=1; i<=n; i++){
            for (int j=i; j<=n; j++){
                System.out.print(" ");
            }
            for (int j=1; j<i; j++){
                System.out.print("*");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void reversePyramid(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int j=i; j<n; j++){
                System.out.print("*");
            }
            for (int j=i; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void diamond(int n){
        pyramid(n);
        reversePyramid(n);
    }

    private static void rightSidedPyramid(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1; i<=n; i++){
            for (int j=i; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void leftSidedPyramid(int n){
        for (int i=1; i<=n; i++){
            for (int j=i; j<=n; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int j=i; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void leftAndRightSidedPyramid(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for (int j=i; j<n; j++){
                System.out.print(" ");
            }
            for (int j=i; j<n; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=1; i<=n; i++){
            for (int j=i; j<=n; j++){
                System.out.print("*");
            }
            for (int j=1; j<i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<i; j++){
                System.out.print(" ");
            }
            for (int j=i; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void squaredDiamond(int n){
        for (int i=1; i<=n; i++){
            for (int j=i; j<=n; j++){
                System.out.print("*");
            }
            for (int j=1; j<i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<i; j++){
                System.out.print(" ");
            }
            for (int j=i; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for (int j=i; j<n; j++){
                System.out.print(" ");
            }
            for (int j=i; j<n; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void emptySquare(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if (i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void squaredNumbers(int n){
        int m = 2 * n;
        for (int i=0; i <= m; i++){
            for (int j=0; j <= m; j++){
                int res = Math.max(Math.max(i, j), Math.max(m-i, m-j)) - n;
                System.out.print(res + "  ");
            }
            System.out.println();
        }
    }
}
