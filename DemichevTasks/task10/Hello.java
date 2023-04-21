package ru.vsuet.DemichevTasks.task10;

import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner scanchik = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = scanchik.nextLine();

        String NormName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Привет, " + NormName + "!");
    }
}
