package ru.vsuet.DemichevTasks.task8;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanchik = new Scanner(System.in);

        // Считываем длины отрезков
        System.out.println("Введите 3 значения через Enter (длины отрезков-сторон треугольника): ");
        int a = scanchik.nextInt();
        int b = scanchik.nextInt();
        int c = scanchik.nextInt();

        // Проверяем, существует ли треугольник с такими сторонами
        if (a + b > c && b + c > a && c + a > b) {
            // Вычисляем углы треугольника (в радианах)
            double alpha = Math.acos((b * b + c * c - a * a) / (2.0 * b * c));
            double beta = Math.acos((c * c + a * a - b * b) / (2.0 * c * a));
            double gamma = Math.acos((a * a + b * b - c * c) / (2.0 * a * b));

            // Вычисляем угол в градусах
            double MaxAngle = Math.toDegrees(Math.max(alpha, Math.max(beta, gamma)));

            System.out.println("Треугольник существует. Наибольший внешний угол составляет " + MaxAngle + " радиан(а)");
        } else {
            System.out.println("Исходя из введённых значений, треугольник не существует.");
        }
    }
}
