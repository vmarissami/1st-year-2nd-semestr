package ru.vsuet.DemichevTasks.task30;

import java.util.ArrayList;
import java.util.Arrays;

public class SashaTanya {
    public static void main(String[] args) {
        int[] l = {50, 55, 57, 58, 60};
        int MaxDistance = 175;
        int CitiesNumb = 3;

        ArrayList<int[]> combinations = getCombinations(l, CitiesNumb);
        int MaxSum = -1;
        for (int[] combo : combinations) {
            int sum = Arrays.stream(combo).sum();
            if (sum <= MaxDistance && sum > MaxSum) {
                MaxSum = sum;
            }
        }
        System.out.println(MaxSum);
    }

    private static ArrayList<int[]> getCombinations(int[] arr, int n) {
        ArrayList<int[]> res = new ArrayList<>();
        int[] combo = new int[n];
        combinationsHelper(res, arr, combo, 0, 0);
        return res;
    }

    private static void combinationsHelper(ArrayList<int[]> res, int[] arr, int[] combo, int index, int start) {
        if (index == combo.length) {
            res.add(Arrays.copyOf(combo, combo.length));
        } else {
            for (int i = start; i < arr.length; i++) {
                combo[index] = arr[i];
                combinationsHelper(res, arr, combo, index + 1, i + 1);
            }
        }
    }
}
