package com.jacandre.questions._0611_valid_triangle_number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array nums, return the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.
 */

public class ValidTriangleNumber {
    public int triangleNumber(int[] nums) {
        var COMBINATION_SIZE = 3;
        List<Integer> input = Arrays.stream(nums).boxed().toList();

        // Generate all 3 element combinations from a list of inputs
        var generatedCombinations = generateCombinations(input, COMBINATION_SIZE);
        // Filter out combinations that do not satisfy triangle requirements
        var validCombinations = validateTripletCombinations(generatedCombinations);

        return validCombinations.size();
    }

    private static <Integer> List<List<Integer>> generateCombinations(List<Integer> input, int combinationSize) {
        List<List<Integer>> result = new ArrayList<>();
        buildCombinations(input, combinationSize, 0, new ArrayList<>(), result);
        return result;
    }

    private static <T> void buildCombinations(
            List<T> input,
            int combinationSize,
            int startIndex,
            List<T> currentCombination,
            List<List<T>> result
    ) {
        if (currentCombination.size() == combinationSize) {
            result.add(new ArrayList<>(currentCombination));
        } else {
            for (int i = startIndex; i < input.size(); i++) {
                currentCombination.add(input.get(i));
                buildCombinations(input, combinationSize, i + 1, currentCombination, result);
                currentCombination.removeLast();
            }
        }
    }

    private static List<List<Integer>> validateTripletCombinations(List<List<Integer>> generatedCombinations) {
        List<List<Integer>> validTripletCombinations = new ArrayList<>();
        for (List<Integer> triplet : generatedCombinations) {
            List<Integer> sortedList = triplet.stream().sorted().toList();
            // A valid triangle is one where the sum of the two shortest sides is longer than the longest side
            if (sortedList.get(0) + sortedList.get(1) > sortedList.get(2)) {
                validTripletCombinations.add(sortedList);
            }
        }

        return validTripletCombinations;
    }
}
