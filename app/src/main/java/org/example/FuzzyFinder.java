package org.example;

import java.util.ArrayList;

public class FuzzyFinder {
     public int linearSearch(ArrayList<Fuzzy> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).color.equals("gold")) {
                return i;
            }
        }
        return -1;
    }

     public int binarySearch(ArrayList<Fuzzy> list) {
    int left = 0;
    int right = list.size() - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;
        String midColor = list.get(mid).color;

        if (midColor.equals("gold")) {
            return mid;
        } else if (midColor.compareTo("gold") < 0) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return -1;
}
}