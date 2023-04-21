package ru.vsuet.DemichevTasks.task4;

public class Vhozhdenie {
    public static void main(String[] args) {
        String stroka = "Hello";
        char letter = 'o';
        int counter = stroka_counter(stroka, letter);
        System.out.println(counter);
    }

    public static int stroka_counter(String stroka, char letter) {
        int counter = 0;
        for (int i = 0; i < stroka.length(); i++) {
            if (stroka.charAt(i) == letter) {
                counter++;
            }
        }
        return counter;
    }
}
