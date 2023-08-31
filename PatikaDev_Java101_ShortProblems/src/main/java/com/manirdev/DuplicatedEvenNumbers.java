package com.manirdev;

public class DuplicatedEvenNumbers {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 1, 2, 6, 4, 6};
        int[] dupEven = new int[nums.length];
        int k = 0;
        for (int i=0; i<nums.length-1; i++){
            for (int j = i+1; j< nums.length; j++){
                if (nums[i] % 2 ==0){
                    if (nums[i] == nums[j]){
                        dupEven[k++] = nums[i];
                    }
                }
            }
        }
        for (int num : dupEven){
            System.out.println(num);
        }
    }
}
