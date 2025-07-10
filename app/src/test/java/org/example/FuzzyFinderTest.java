package org.example;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FuzzyFinderTest {

    private FuzzyFinder finder;
    private ArrayList<Fuzzy> sortedFuzzies;
    private ArrayList<Fuzzy> randomFuzzies;

    @BeforeEach
    public void setup() {
        FuzzyListGenerator generator = new FuzzyListGenerator(1);
        finder = new FuzzyFinder();

        sortedFuzzies = generator.sortedRainbowFuzzies();
        randomFuzzies = generator.randomizedRainbowFuzzies();
    }

    @Test
    public void testLinearSearchFindsGold() {
        int indexSorted = finder.linearSearch(sortedFuzzies);
        int indexRandom = finder.linearSearch(randomFuzzies);

        assertTrue(indexSorted >= 0);
        assertTrue(indexRandom >= 0);
        assertEquals("gold", sortedFuzzies.get(indexSorted).color);
        assertEquals("gold", randomFuzzies.get(indexRandom).color);
    }

    @Test
    public void testBinarySearchFindsGold() {
        int indexSorted = finder.binarySearch(sortedFuzzies);
        assertTrue(indexSorted >= 0);
        assertEquals("gold", sortedFuzzies.get(indexSorted).color);
    }
}