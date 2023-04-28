package ru.vsuet.DemichevTasks.task21;

import java.util.HashMap;
import java.util.Map;

public class Numpad {
    public static void main(String[] args) {
        String NumpadNumb = "789";
        String PhoneNumb = convertNumpadToPhone(NumpadNumb);
        System.out.println(PhoneNumb); // 123
    }

    public static String convertNumpadToPhone(String NumpadNumbs) {
        Map<Character, Character> map = new HashMap<>();
        map.put('1', '7');
        map.put('2', '8');
        map.put('3', '9');
        map.put('4', '4');
        map.put('5', '5');
        map.put('6', '6');
        map.put('7', '1');
        map.put('8', '2');
        map.put('9', '3');
        map.put('0', '0');


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < NumpadNumbs.length(); i++) {
            char c = NumpadNumbs.charAt(i);
            sb.append(map.get(c));
        }
        return sb.toString();
    }
}
