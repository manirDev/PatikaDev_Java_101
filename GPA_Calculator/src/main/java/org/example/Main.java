package org.example;

import java.util.Scanner;

/*
* Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
* ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
* */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int math, physic, chemistry, english, history, music;

        System.out.println("Enter your Math grade: ");
        math = scanner.nextInt();
        System.out.println("Enter your Physic grade: ");
        physic = scanner.nextInt();
        System.out.println("Enter your Chemistry grade: ");
        chemistry = scanner.nextInt();
        System.out.println("Enter your English grade: ");
        english = scanner.nextInt();
        System.out.println("Enter your History grade: ");
        history = scanner.nextInt();
        System.out.println("Enter your Music grade: ");
        music = scanner.nextInt();

        int gradeSum = (math + physic + chemistry + english + history + music);
        double avg = (double)gradeSum / 6;
        if (avg > 60){
            System.out.println("You Passed.....:) with a GPA : " + avg);
        }
        else{
            System.out.println("Sorry, you could not pass....:( your GPA: " + avg);
        }
    }
}