package com.manirdev;

public class HarmonicAverage {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        double harmonicSum = 0;
        for (int i=0; i<nums.length; i++){
            harmonicSum += (double)1/nums[i];
        }
        System.out.println("Result: " + (double)nums.length/harmonicSum);
    }
}
