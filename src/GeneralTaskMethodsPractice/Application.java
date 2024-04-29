package GeneralTaskMethodsPractice;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int randomNum = createRandomNum();
        System.out.println(randomNum);
        System.out.print("Bir reqem texmin edin : ");

        while (true) {

            int number = scanner(sc);
            correctGuest(number, randomNum);
            uncorrectGuest(number, randomNum);
        }
    }

    public static void correctGuest(int number, int rm) {
        if (number == rm) {
            System.out.println("Tebrikler  dogru texmin etdiniz!!!");
            System.exit(0);
        }

    }

    public static void uncorrectGuest(int number, int rm) {
        if (number > rm) {
            System.out.print("Biraz  daha kicik bir reqem daxil edin : ");
        } else if (number < rm) {
            System.out.print("Biraz  daha  boyuk bir reqem daxil edin : ");
        }

    }

    public static int scanner(Scanner sc) {

        int number = sc.nextInt();
        return number;
    }

    public static int createRandomNum() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}


