package CalculateAverage;

import java.util.Arrays;

/**
Write a function which calculates the average of the numbers in a given list.
Note: Empty arrays should return 0
*/

public class Kata{
    public static double find_average(int[] array){
       /* double sum = 0;
        double average = 0;
        for (double i = 0; i < array.length; i++) {
            sum = sum + array[(int) i];
            average = sum / array.length;
        }
        return average;*/
        return Arrays.stream(array).average().orElse(0);
    }
}
