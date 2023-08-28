package com.manirdev;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static final int gameRight = 5;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // 0-100
        int randNumber = rand.nextInt(100);
        // randNumber = (int)Math.random() * 100;
        int right = 0;
        int guessedNumber;
        int[] wrong = new int[gameRight];
        boolean isWin = false;
        boolean isWrong = false;

        //System.out.println("Rand Number: " + randNumber);
        while (right < gameRight){
            System.out.print("Enter your guess: ");
            guessedNumber = input.nextInt();
            if (guessedNumber < 0 || guessedNumber > 99){
                System.out.println("Enter a number between 0-100");
                if (isWrong){
                    right++;
                    System.out.println("You entered wrong number. Remaining right: " + (gameRight - right));
                }else {
                    isWrong = true;
                    System.out.println("If you enter one more wrong number your right will be decreased");
                }
                continue;
            }
            if (guessedNumber == randNumber){
                System.out.println("Congratulations :), You win!, guessed number is: " + randNumber);
                isWin = true;
                break;
            }
            else{
                System.out.println("You guessed a wrong number !");
                if (guessedNumber > randNumber){
                    System.out.println(guessedNumber + " number is bigger than the secret number. ");
                }
                else{
                    System.out.println(guessedNumber + " number is smaller than the secret number. ");
                }
                wrong[right++] = guessedNumber;
                System.out.println("Remaining right: " + (gameRight - right));
            }
        }
        if (!isWin){
            System.out.println("You lost the match :(");
            if (!isWrong){
                System.out.println("Your guesses: " + Arrays.toString(wrong));
            }
        }
    }
}