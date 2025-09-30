package com.jacandre.questions;

import com.jacandre.questions._2221_triangular_sum_of_array.TriangleSumOfArray;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@ExtendWith(MockitoExtension.class)
public class TriangleSumOfArrayTest {
    @Test
    void testTriangleSumOfArray() {
        int[] points = {1,2,3,4,5};
        double expected = 8;
        TriangleSumOfArray solver = new TriangleSumOfArray();
        assertEquals(expected, solver.triangularSum(points));
    }
}
