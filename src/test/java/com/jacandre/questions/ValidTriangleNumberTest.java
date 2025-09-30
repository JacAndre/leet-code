package com.jacandre.questions;

import com.jacandre.questions._0611_valid_triangle_number.ValidTriangleNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ValidTriangleNumberTest {
    @Test
    void testTriangleNumber() {
        int[] nums = {2, 2, 3, 4};
        ValidTriangleNumber solver = new ValidTriangleNumber();
        assertEquals(3, solver.triangleNumber(nums));
    }
}