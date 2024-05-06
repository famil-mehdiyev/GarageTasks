package stringbuilder;

import java.util.Scanner;

public class ReverseViaStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter reversed text :");
        StringBuilder text= new StringBuilder(sc.nextLine());
       StringBuilder stringBuilder =reversedText(text);
        System.out.println(stringBuilder);
    }

    public static StringBuilder reversedText(StringBuilder stringBuilder) {
        StringBuilder modifyedStringBuilder = new StringBuilder();
        for (int i = stringBuilder.length()-1; i >= 0; i--) {
            modifyedStringBuilder.append(stringBuilder.charAt(i));
        }

        return modifyedStringBuilder;
    }

}