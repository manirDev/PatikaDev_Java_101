package com.manirdev;


import java.util.Scanner;

public class Main {
    static final String defaultUsername = "manir";
    static final String defaultPassword = "123";
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);

        String username, password;
        int right = 3;
        int balance = 1500;
        int select;

        while(right > 0){
            System.out.print("Username: ");
            username = input.next();
            System.out.print("Password: ");
            password = input.next();

            if (username.equals(defaultUsername) && password.equals(defaultPassword)){
                System.out.println("Hi, Welcome to your X bank!");
                do {
                    System.out.println("1-Deposit\n2-Withdraw\n3-Balance Inquiry\n4-Logout");
                    System.out.println("Please, Choose what you want to do: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1 -> {
                            System.out.print("Amount of money: ");
                            int price = input.nextInt();
                            balance += price;
                        }
                        case 2 -> {
                            System.out.print("Amount of money: ");
                            int price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient balance");
                            } else {
                                balance -= price;
                            }
                        }
                        case 3 -> {
                            System.out.println("Balance: " + balance);
                        }
                        default -> {
                            System.out.println("You selection is not in [1-4]");
                        }
                    }

                }while (select != 4);
                System.out.println("See you again");
                break;
            }else {
                right--;
                System.out.println("Wrong username or password. Try again");
                if (right == 0){
                    System.out.println("Your account has been blocked, please contact the bank.");
                }else{
                    System.out.println("Your Remaining Rights: " + right);
                }
            }

        }

    }
}