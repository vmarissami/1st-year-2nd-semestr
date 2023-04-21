package ru.vsuet.DemichevTasks.task9;

import java.util.Scanner;

public class Okonchaniye {
    public static void main(String[] args) {
        Scanner scanchik = new Scanner(System.in);

        // Считываем две строки
        System.out.println("Введите 1-ую строку: ");
        String str1 = scanchik.nextLine();
        System.out.println("Введите 2-ую строку: ");
        String str2 = scanchik.nextLine();

        boolean endsWith = str1.endsWith(str2);

        if (endsWith) {
            System.out.println("2-ая строка ЯВЛЯЕТСЯ окончанием 1-ой.");
        } else {
            System.out.println("2-ая строка НЕ ЯВЛЯЕТСЯ окончанием 1-ой.");
        }
    }
}
