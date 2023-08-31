package com.manirdev;

import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {
    public static void main(String[] args) {
        int[] nums = {10, 20, 20, 10, 10, 20, 5, 20};
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("Element Frequencies: ");
        for (int i=0; i<nums.length; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i]) + 1);
            }
            else map.put(nums[i], 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " is duplicated " + entry.getValue() + " times");
        }
    }
}
