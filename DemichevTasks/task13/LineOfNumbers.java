package ru.vsuet.DemichevTasks.task13;

import java.util.Scanner;

public class LineOfNumbers {
    public static void main(String[] args) {
        Scanner scanchik = new Scanner(System.in);

        System.out.println("Введите начальное число: ");
        int First = scanchik.nextInt();

        System.out.println("Введите шаг: ");
        int Step = scanchik.nextInt();

        System.out.println("Введите конечное число: ");
        int Last = scanchik.nextInt();

        for (int i = 0; i <= Last/Step; i++) {
            int numb = First + i * Step;
            System.out.print(numb + " ");
        }
    }
}

