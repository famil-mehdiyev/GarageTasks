package GeneralTasks;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please assign  array  dimension");
        int dimensionArray = sc.nextInt();
        int[] array = new int[dimensionArray];
        int mod = 0;
        int temp = 0;
        int i = 0;

        while (i<array.length) {
            System.out.println("please  enter number");
            int singleNumb = sc.nextInt();
            int singleNumbCopy = singleNumb;
            while (singleNumbCopy > 0) {
                mod = singleNumbCopy % 10;
                singleNumbCopy /= 10;
                temp += mod;
            }
            if (!(temp % 2 == 0)) {
                array[i] = singleNumb;
                i++;
            }else{
                System.out.println(" try again");
            }
        }
        for(int arr :array){
            System.out.println(arr);
        }
    }
}
