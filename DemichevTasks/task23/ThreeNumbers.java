package ru.vsuet.DemichevTasks.task23;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner Scanchik = new Scanner(System.in);
        int n = Scanchik.nextInt();
        int a = Scanchik.nextInt();
        int b = Scanchik.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % a == 0 || i % b == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
