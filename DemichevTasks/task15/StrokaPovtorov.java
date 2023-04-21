package ru.vsuet.DemichevTasks.task15;

import java.util.*;

public class StrokaPovtorov {
    public static void main(String[] args) {
        Scanner scanchik = new Scanner(System.in);
        String input = scanchik.nextLine();

        String[] words = input.split(" ");
        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));

        String output = String.join(" ", uniqueWords);
        System.out.println(output);

    }
}
