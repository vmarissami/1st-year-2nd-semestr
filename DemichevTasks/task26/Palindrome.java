package ru.vsuet.DemichevTasks.task26;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner Scanchik = new Scanner(System.in);
        String s = Scanchik.nextLine();

        int MaxPalindromeLength = 1;
        String MaxPalindrome = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            String currentPalindrome = getPalindrome(s, i, i);
            if (currentPalindrome.length() > MaxPalindromeLength) {
                MaxPalindromeLength = currentPalindrome.length();
                MaxPalindrome = currentPalindrome;
            }

            currentPalindrome = getPalindrome(s, i, i + 1);
            if (currentPalindrome.length() > MaxPalindromeLength) {
                MaxPalindromeLength = currentPalindrome.length();
                MaxPalindrome = currentPalindrome;
            }
        }

        System.out.println(MaxPalindromeLength);
    }

    private static String getPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

}
