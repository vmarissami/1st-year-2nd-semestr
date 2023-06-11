package ru.vsuet.DemichevTasks.task47;

import java.util.ArrayList;
import java.util.List;

public class Snakey {
    public static List<Integer> snail(int[][] array) {
        List<Integer> result = new ArrayList<>();

        int rows = array.length;
        int columns = array[0].length;

        int topRow = 0, bottomRow = rows - 1;
        int leftColumn = 0, rightColumn = columns - 1;

        while (topRow <= bottomRow && leftColumn <= rightColumn) {

            for (int i = leftColumn; i <= rightColumn; i++) {
                result.add(array[topRow][i]);
            }
            topRow++;

            for (int i = topRow; i <= bottomRow; i++) {
                result.add(array[i][rightColumn]);
            }
            rightColumn--;

            if (topRow <= bottomRow) {

                for (int i = rightColumn; i >= leftColumn; i--) {
                    result.add(array[bottomRow][i]);
                }
                bottomRow--;
            }

            if (leftColumn <= rightColumn) {

                for (int i = bottomRow; i >= topRow; i--) {
                    result.add(array[i][leftColumn]);
                }
                leftColumn++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> snailArray = snail(array);
        System.out.println(snailArray);

        int[][] array2 = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        List<Integer> snailArray2 = snail(array2);
        System.out.println(snailArray2);
    }
}
