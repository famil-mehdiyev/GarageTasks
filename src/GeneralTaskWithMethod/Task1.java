package GeneralTaskWithMethod;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please  enter  number:");
        int number = sc.nextInt();
            checkIfNumberIsSimpleOrPrime(number);
        }

    public static void checkIfNumberIsSimpleOrPrime(int number) {
        int count=0;
        for(int i=2;i<number/2;i++){
            if(number%i==0){
                count++;
            }
            if(count>0){
                System.out.println("murekkebdir");
                break;
            }

        }
        if(count==0){
            System.out.println("sadedir");
        }


    }

}