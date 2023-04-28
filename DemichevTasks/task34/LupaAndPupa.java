package ru.vsuet.DemichevTasks.task34;

import java.util.Arrays;
import java.util.Comparator;

public class LupaAndPupa {
    public static void main(String[] args) {
        String input = "56 65 74 100 99 68 86 180 90";
        String[] weights = input.split(" ");
        Arrays.sort(weights, Comparator.comparingInt(LupaAndPupa::sumOfDigits).reversed());
        System.out.println(String.join(" ", weights));
    }

    private static int sumOfDigits(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }
        return sum;
    }

}
