package com.jacandre.questions;

import com.jacandre.questions._0812_largest_triangle_area.LargestTriangleArea;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@ExtendWith(MockitoExtension.class)
public class LargestTriangleAreaTest {
    @Test
    void testLargestTriangleArea() {
        int[][] points = {{0,0},{0,1},{1,0}};
        double expected = 0.50000;
        LargestTriangleArea solver = new LargestTriangleArea();
        assertEquals(expected, solver.largestTriangleArea(points));
    }
}
