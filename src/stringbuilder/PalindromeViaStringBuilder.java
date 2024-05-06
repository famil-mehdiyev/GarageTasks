package stringbuilder;

import java.util.Scanner;

public class PalindromeViaStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter text in below :");
        StringBuilder text = new StringBuilder(sc.nextLine());

        findPalindrome(text,reverseText(text));

    }
    public static void findPalindrome(StringBuilder text,StringBuilder reversedText){
        if(text.toString().equals(reversedText.toString())){
            System.out.println("text is Palindrome");
        }else{
            System.out.println("text is  not  Palindrome");
        }
    }
    public static StringBuilder reverseText(StringBuilder text){
        StringBuilder modifyedText = new StringBuilder();
        for(int i=text.length()-1;i>=0;i--){
            modifyedText.append(text.charAt(i));
        }

        return modifyedText;
    }
}

