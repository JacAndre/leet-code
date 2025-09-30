package com.jacandre.questions._0001_two_sum;

import lombok.extern.slf4j.Slf4j;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */

@Slf4j
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                log.info("Checking nums[{}] = {} and nums[{}] = {}", i, nums[i], j, nums[j]);
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSumHashMap(int[] nums, int target) {
        // Potential optimised solution
        return null;
    }
}
