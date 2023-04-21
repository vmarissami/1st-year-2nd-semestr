package ru.vsuet.DemichevTasks.task2;

import java.util.Scanner;

public class Visitors {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        System.out.println("Введите 1 (сотрудник) или 0 (посетитель) через запятую без пробела:");
        String vvod = myscanner.nextLine();
        String[] values = vvod.split(",");

        int SotrudnikiCounter2 = 0;
        for (String value : values) {
            if (value.trim().equals("1")) {
                SotrudnikiCounter2++;
            }
        }
        System.out.println("Количество сотрудников: " + SotrudnikiCounter2);
    }
}
