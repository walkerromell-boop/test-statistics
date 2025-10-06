package com.pluralsight;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class TestStatistics {
    public static void main(String[] args) {
        int[] testscores = {59, 60, 73, 2, 54, 88, 85, 90, 70, 92};
        int sum = 0;
        int lowest = testscores[1];
        int highest = testscores[0];

        Arrays.sort(testscores);
////        Take all numbers and add them using for loop
        for (int i = 0; i < testscores.length; i++) {
            sum += testscores[i];

        }
        for (int l = 0; l < testscores.length; l++) {
            if (testscores[l] < lowest) {
                lowest = testscores[l];
            }
            for (int h = 0; h < testscores.length; h++) {
                if (testscores[h] > highest) {
                    highest = testscores[h];
                }
            }

        }
        System.out.println("The highest score is: " + highest);
        System.out.println("The lowest score is: " + lowest);
        double average = sum / testscores.length;
        System.out.println(average);
        System.out.println(Arrays.toString(testscores));

    }
}

//imported list for arrays