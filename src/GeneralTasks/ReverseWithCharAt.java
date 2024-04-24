package GeneralTasks;

import java.util.Scanner;

public class ReverseWithCharAt {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("please below enter words:");
        String text= sc.nextLine();
        String reverse = "";




            for (int i=text.length()-1;i>=0;i--){
                reverse+=text.charAt(i);
            }
            System.out.println(reverse);
    }
}
