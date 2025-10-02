package com.jacandre.questions;

import com.jacandre.questions._3100_water_bottles.WaterBottlesII;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class WaterBottlesIITest {
    @Test
    void testMaxBottlesDrunk() {
        var numBottles = 13;
        var numExchange = 6;
        var expected = 15;
        WaterBottlesII solver = new WaterBottlesII();
        assertEquals(expected, solver.maxBottlesDrunk(numBottles, numExchange));
    }
}
