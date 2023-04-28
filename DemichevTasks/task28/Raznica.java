package ru.vsuet.DemichevTasks.task28;

import java.util.Scanner;

public class Raznica {
    public static void main(String[] args) {
        Scanner Scanchik = new Scanner(System.in);
        int n = Scanchik.nextInt();

        int x = (int) Math.sqrt(n);
        int y = x + 1;

        int diff = y * y - x * x;

        if (diff == n) {
            System.out.println(x * x + " " + y * y);
        } else {
            System.out.println("Invalid input");
        }
    }

}
