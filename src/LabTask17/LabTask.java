package LabTask17;

import java.util.Locale;
import java.util.Scanner;

public class LabTask {
    public static void main(String[] args) {

        String[] arr = {"Famil", "Elshen", "Memmedeli", "Elvin", "Zeka","Alexander"};
        String character = enterChar();

        checkCharacter(arr, character.charAt(0));

    }

    public static String enterChar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("herfi daxil edin");
        String character = sc.next();
        return character;
    }

    public static void checkCharacter(String[] arr, char character) {


        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].toLowerCase().charAt(j) == character) {
                    System.out.println(arr[i] + "-verilen herf " + j + " : bu indeksdedir");
                } else if (arr[i].toUpperCase().charAt(j) == character) {
                    System.out.println(arr[i] + "-verilen herf " + j + " : bu indeksdedir");
                }
            }
        }
    }
}

