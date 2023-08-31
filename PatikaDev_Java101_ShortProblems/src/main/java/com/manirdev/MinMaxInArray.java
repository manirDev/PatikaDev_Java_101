package com.manirdev;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] nums = {15,12,788,1,-1,-778,2,0};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Arrays.sort(nums);
        for (int num : nums){
            if (num > number){
                max  = num;
                break;
            }
        }
        for (int i=nums.length-1; i>=0; i--){
            if (number > nums[i]){
                min = nums[i];
                break;
            }
        }
        System.out.println("Min cloe to " + number + " is: " + min);
        System.out.println("Max cloe to " + number + " is: " + max);
    }

}
