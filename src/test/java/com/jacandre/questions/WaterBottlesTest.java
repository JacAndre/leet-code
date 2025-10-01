package com.jacandre.questions;

import com.jacandre.questions._1518_water_bottles.WaterBottles;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class WaterBottlesTest {
    @Test
    void testNumWaterBottles() {
        var numBottles = 15;
        var numExchange = 4;
        var expected = 19;
        WaterBottles solver = new WaterBottles();
        assertEquals(expected, solver.numWaterBottles(numBottles, numExchange));
    }
}
