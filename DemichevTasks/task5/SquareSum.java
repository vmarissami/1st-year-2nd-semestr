package ru.vsuet.DemichevTasks.task5;

import java.util.Scanner;
public class SquareSum {
    public static void main(String[] args) {
        Scanner scanchik = new Scanner(System.in);

        int sum = 0;
        while (scanchik.hasNextInt()) {
            int numb = scanchik.nextInt();
            sum += numb * numb;
        }
        System.out.println(sum);
    }
}
