package org.example;

import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    FuzzyListGenerator generator = new FuzzyListGenerator();
    FuzzyFinder finder = new FuzzyFinder();

    ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
    ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();

    int testOne = finder.linearSearch(sortedFuzzies);
    System.out.println(testOne);

    int testTwo = finder.binarySearch(sortedFuzzies);
    System.out.println(testTwo);

    int testThree = finder.linearSearch(randomFuzzies);
    System.out.println(testThree);

    int testFour = finder.binarySearch(randomFuzzies);
    System.out.println(testFour);
  }
}
