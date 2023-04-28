package ru.vsuet.DemichevTasks.task27;

import java.util.Scanner;

public class Cesar {
    public static void main(String[] args) {
        Scanner Scanchik = new Scanner(System.in);

        String s = Scanchik.nextLine();
        int shift = Scanchik.nextInt();
        String direction = Scanchik.next();

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                if (direction.equals("right")) {
                    c = (char) ((c - 'a' + shift) % 26 + 'a');
                } else if (direction.equals("left")) {
                    c = (char) ((c - 'a' - shift + 26) % 26 + 'a');
                }
            }
            result += c;
        }

        System.out.println(result);
    }
}
