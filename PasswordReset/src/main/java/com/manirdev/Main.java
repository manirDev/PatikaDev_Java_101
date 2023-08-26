package com.manirdev;

import java.util.Scanner;

public class Main {
    static final String defaultUserName = "manir";
    static final String defaultPassword = "123";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName;
        String password;

        System.out.println("Enter your Username");
        userName = input.next();
        System.out.println("Enter your Password");
        password = input.next();
        if (userName.equals(defaultUserName) && password.equals(defaultPassword)){
            System.out.println("Logged Successfully");
        }else{
            System.out.println("Do you want to change your Password");
            String choice = input.next();
            if (choice.equalsIgnoreCase("Yes")){
                System.out.println("Enter your new Password");
                resetPassword();
            }
            else {
                System.out.println("Password is not changed.");
            }
        }
    }
    private static void resetPassword(){
        Scanner input = new Scanner(System.in);
        while (true){
            String newPassword = input.next();
            if (newPassword.equals(defaultPassword)){
                System.out.println("Your new Password should not be same as the previous one, try again: ");
            }
            else{
                System.out.println("Password changed successfully:)");
                break;
            }
        }
    }
}