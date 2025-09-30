package com.jacandre.questions._0812_largest_triangle_area;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of points on the X-Y plane points where points[i] = [xi, yi],
 * return the area of the largest triangle that can be formed by any three different points.
 * Answers within 10^-5 of the actual answer will be accepted.
 */

@Slf4j
public class LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        var COMBINATION_SIZE = 3;
        var input = Arrays.stream(points).map(row -> Arrays.stream(row).boxed().toList()).toList();

        var triangleCombinations = generateCombinations(input, COMBINATION_SIZE);

        return calculateLargestTriangleArea(triangleCombinations);
    }

    private static List<List<List<Integer>>> generateCombinations(List<List<Integer>> input, int combinationSize) {
        List<List<List<Integer>>> result = new ArrayList<>();
        buildCombinations(input, combinationSize, 0, new ArrayList<>(), result);
        return result;
    }

    private static <T> void buildCombinations(
            List<List<T>> input,
            int combinationSize,
            int startIndex,
            List<List<T>> currentCombination,
            List<List<List<T>>> result
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

    private double calculateLargestTriangleArea(List<List<List<Integer>>> generatedCombinations) {
        var largestArea = 0.00000;

        for (var points : generatedCombinations) {
            var area = triangleArea(points.get(0), points.get(1), points.get(2));
            if (area > largestArea) {
                largestArea = area;
            }
        }

        return largestArea;
    }

    private double triangleArea(List<Integer> p1, List<Integer> p2, List<Integer> p3) {
        int x1 = p1.get(0), y1 = p1.get(1);
        int x2 = p2.get(0), y2 = p2.get(1);
        int x3 = p3.get(0), y3 = p3.get(1);

        return 0.5 * Math.abs((x1 * (y2 - y3)) + (x2 * (y3 - y1)) + (x3 * (y1 - y2)));
    }
}
