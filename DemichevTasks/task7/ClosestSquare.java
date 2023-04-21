package ru.vsuet.DemichevTasks.task7;

import java.util.Scanner;

public class ClosestSquare {
    public static void main(String[] args) {
        Scanner scanchik = new Scanner(System.in);
        System.out.print("Введите число: ");
        int numb = scanchik.nextInt();

        int closestSquare = 0;
        int closestDistance = Integer.MAX_VALUE;

        for (int i = 0; i <= numb; i++) {
            int square = i * i;
            int rasstoyanie = Math.abs(numb - square);

            if (rasstoyanie < closestDistance) {
                closestDistance = rasstoyanie;
                closestSquare = square;
            }
        }

        System.out.println("Ближайший квадрат: " + closestSquare);
    }
}
