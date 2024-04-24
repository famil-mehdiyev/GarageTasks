package MethodsLessons;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            boolean check = true;
            switchh(sc);

            while (check) {
                System.out.println("Davam etmek isteyirsinizmi :");
                String continueOperation = sc.nextLine();

                if (continueOperation.equals("n")) {
                    System.exit(0);
                } else if (continueOperation.equals("y")) {
                    check=false;
                }else{
                    check=true;
                }
            }
        }
    }

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int subtract(int firstNumber, int secondnumber) {
        return firstNumber - secondnumber;
    }

    public static int multiply(int firstNumber, int secondnumber) {
        return firstNumber * secondnumber;
    }

    public static int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public static void switchh(Scanner sc) {
        System.out.println("""
                1.Add
                2.Subtract
                3.Multiply
                4.Divide
                """);
        System.out.println("please  enter operation :");
        int operation = sc.nextInt();
        sc.nextLine();
        if (operation < 1 || operation > 4) {
            System.out.println("Wrong entry!!!");
        return;
        }

        System.out.println("please enter first number :");
        int firstNumber = sc.nextInt();
        System.out.println("please enter second number :");
        int secondNumber = sc.nextInt();
        sc.nextLine();
        switch (operation) {
            case 1 -> System.out.println("Result : " + add(firstNumber, secondNumber));
            case 2 -> System.out.println("Result : " + subtract(firstNumber, secondNumber));
            case 3 -> System.out.println("Result : " + multiply(firstNumber, secondNumber));
            case 4 -> System.out.println("Result : " + divide(firstNumber, secondNumber));
            default -> System.out.println("Wrong entry !!!");
        }

    }

}