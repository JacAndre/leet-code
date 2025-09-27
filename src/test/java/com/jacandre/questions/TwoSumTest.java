package com.jacandre.questions;

import com.jacandre.questions._001_two_sum.TwoSum;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@Slf4j
@ExtendWith(MockitoExtension.class)
public class TwoSumTest {
    @Test
    void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        TwoSum solver = new TwoSum();
        assertArrayEquals(new int[] {1, 2}, solver.twoSum(nums, target));
    }
}
