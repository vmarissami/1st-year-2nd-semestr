package ru.vsuet.DemichevTasks.task6;

import java.util.Scanner;
public class SimpleNumb {
    public static void main(String[] args) {
        Scanner scanchik = new Scanner(System.in);
        System.out.print("Введите число: ");
        int numb = scanchik.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(numb); i++) {
            if (numb % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && numb > 1) {
            System.out.println(numb + " - простое число.");
        } else {
            System.out.println(numb + " - не является простым числом.");
        }
    }
}
