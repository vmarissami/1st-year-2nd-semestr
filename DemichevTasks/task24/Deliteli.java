package ru.vsuet.DemichevTasks.task24;

 import java.util.Scanner;
public class Deliteli {
    public static void main(String[] args) {
        Scanner Scanchik = new Scanner(System.in);
        int m = Scanchik.nextInt();
        int n = Scanchik.nextInt();
        int[] divisors = new int[args.length - 2];
        for (int i = 2; i < args.length; i++) {
            divisors[i - 2] = Integer.parseInt(args[i]);
        }

        int sum = 0;
        for (int i = m; i <= n; i++) {
            for (int j = 0; j < divisors.length; j++) {
                if (i % divisors[j] == 0) {
                    sum += i;
                    break;
                }
            }
        }

        System.out.println(sum);
    }
}
