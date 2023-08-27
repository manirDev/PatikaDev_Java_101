package com.manirdev;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        System.out.println(helper(s));
    }

    private static boolean helper(String s){
        int start = 0;
        int end = s.length() - 1;
        while (start < end){
            if (s.charAt(start) != s.charAt(end)){
                return false;
            }
            end--;
            start++;
        }
        return true;
    }
}