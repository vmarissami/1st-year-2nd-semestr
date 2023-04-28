package ru.vsuet.DemichevTasks.task32;

import java.util.Scanner;

public class WoodenSticks {
    public static void main(String[] args) {
        Scanner Scanchik = new Scanner(System.in);
        long n = Scanchik.nextLong();
        boolean sashaTurn = true;
        while (n > 1) {
            if (n % 2 == 0) {
                if (sashaTurn) {
                    n = n / 2;
                } else {
                    n = n - 1;
                }
            } else {
                n = n - 1;
            }
            sashaTurn = !sashaTurn;
        }
        if (sashaTurn) {
            System.out.println("Таня");
        } else {
            System.out.println("Саша");
        }
    }

}
