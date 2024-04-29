package StringMethodsLabTask18;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String words = reverse(scanner(sc));
        System.out.println(words);
    }

    public static String scanner(Scanner sc){
        System.out.println("Sozleri daxil edin");
        return sc.nextLine();
    }

    public static String  reverse (String word){

        String reverse = "";
        for (int i= word.length()-1;i>=0;i--){
           reverse+= word.charAt(i);
        }
return reverse.substring(0,1).toUpperCase()+ reverse.substring(1).toLowerCase();
    }

}
