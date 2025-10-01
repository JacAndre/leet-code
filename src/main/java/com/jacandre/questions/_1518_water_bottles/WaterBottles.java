package com.jacandre.questions._1518_water_bottles;

/**
 * There are numBottles water bottles that are initially full of water.
 * You can exchange numExchange empty water bottles from the market with one full water bottle.
 * The operation of drinking a full water bottle turns it into an empty bottle.
 * Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.
 */

public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;

        while(empty >= numExchange) {
            total += empty/numExchange;
            empty = (empty/numExchange) + (empty%numExchange);
        }

        return total;
    }
}
