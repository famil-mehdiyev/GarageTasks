package MethodsLessons;

import java.util.Scanner;

public class GeneralTask1 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("please enter number: ");
        int number = sc.nextInt();
        System.out.println("please enter power");
        int power = sc.nextInt();

        int result = power(number,power);
        System.out.println(result);
    }
    public static int power(int number,int power){
        int result=1;
        for(int i=0;i<power;i++){
            result*=number;

        }
        return result;
    }
}
