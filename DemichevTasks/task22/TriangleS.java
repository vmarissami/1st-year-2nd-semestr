package ru.vsuet.DemichevTasks.task22;

import java.util.Scanner;
public class TriangleS {
    public static void main(String[] args) {
        double s, Ploschad;
        Scanner Scanchik = new Scanner(System.in);

        System.out.println("Введите 3 стороны треугольника через Enter: ");
        double side1 = Scanchik.nextDouble();
        double side2 = Scanchik.nextDouble();
        double side3 = Scanchik.nextDouble();

        s = (side1 + side2 + side3)/2;
        Ploschad = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

        System.out.println("Площадь треугольника = " + Ploschad);
    }
}
