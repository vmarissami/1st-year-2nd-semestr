package ru.vsuet.DemichevTasks.task11;

import java.util.Scanner;

public class BezGlasnyh {
    public static void main(String[] args) {
        Scanner scanchik = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String str = scanchik.nextLine();

        String result = str.replaceAll("[euioaEUIOA]", "");

        System.out.println("Результат без гласных: " + result);
    }
}
