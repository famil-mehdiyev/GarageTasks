package FibonacciViaRecursiveMethods;

import java.util.Scanner;

public class GeneralTaskStringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number =scanner(sc);
        fibonacci(number);
        for(int i=0;i<number;i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int  scanner(Scanner sc){
        System.out.print("please  enter number : ");
        int numb = sc.nextInt();
        return numb;
    }
    public static int fibonacci(int number) {
        if (number <= 1) {
            return number;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

}
