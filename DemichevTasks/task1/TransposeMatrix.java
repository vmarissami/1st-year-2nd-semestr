package ru.vsuet.DemichevTasks.task1;
// На ввод поступает матрица любой размерности.
// Выполните транспонирование матрицы →
// строки становятся столбцами и выведите ее на экран.

import java.util.Scanner;
// если что-то ввели в консоли,
// а нам надо считать что же именно ввели  - используем сканер

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите кол-во строк матрицы: ");
        int stroki = vvod.nextInt();
        System.out.println("Введите кол-во столбцов матрицы: ");
        int stolbi = vvod.nextInt();

        int [][] matrix = new int[stroki][stolbi];
        for (int i = 0; i < stroki; i++) {
            for (int j = 0; j < stolbi; j++) {
                System.out.printf("Введите элемент [%d][%d]: ", i+1, j+1);
                matrix[i][j] = vvod.nextInt();
            }
        }
        int[][] transpose = new int[stroki][stolbi];
        for (int i=0; i < stroki; i++) {
            for (int j = 0; j < stolbi; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        System.out.println("Ваша транспонированная матрица: ");
        for (int i = 0; i < stroki; i++) {
            for (int j = 0; j < stolbi; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
