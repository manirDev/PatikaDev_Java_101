package com.manirdev;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Functions functions = new Functions();
        int selection;

        String menu = "1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n5-Power\n"+
                      "6-Factorial\n7-Mode\n8-Area and Perimeter\n0-Logout";
        
        do{
            System.out.println(menu);
            System.out.println("Please, enter a selection: ");
            selection = input.nextInt();
            switch (selection){
                case 1 -> {
                    functions.addition();
                    break;
                }
                case 2 -> {
                    functions.subtraction();
                    break;
                }
                case 3 -> {
                    functions.multiplication();
                    break;
                }
                case 4 -> {
                    functions.division();
                    break;
                }
                case 5 -> {
                    functions.power();
                    break;
                }
                case 6 -> {
                    functions.factorial();
                    break;
                }
                case 7 -> {
                    functions.mode();
                    break;
                }
                case 8 -> {
                    functions.areaAndPerimeter();
                    break;
                }
                case 0 -> {
                    break;
                }
                default -> System.out.println("You entered a wrong number, try again.");
            }
        }while (selection != 0);
    }


}