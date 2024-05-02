package LabTask19;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String reversedText = findPalindrome(text);
        boolean isPalindrome = isPalindrome(text, reversedText);
        System.out.println(isPalindrome);

    }

    public static String findPalindrome(String text) {
        String reversedText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }
        return reversedText;
    }

    public static boolean isPalindrome(String text, String reversedText) {


        if (text.equalsIgnoreCase(reversedText)) {

            return true;
        }

        return false;

    }
}
