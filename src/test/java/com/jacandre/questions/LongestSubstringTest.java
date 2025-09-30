package com.jacandre.questions;

import com.jacandre.questions._0003_longest_substring.LongestSubstring;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@ExtendWith(MockitoExtension.class)
public class LongestSubstringTest {
    @Test
    void testLongestSubstring() {
        var input = "abccba";
        double expected = 3;
        LongestSubstring solver = new LongestSubstring();
        assertEquals(expected, solver.lengthOfLongestSubstring(input));
    }
}
