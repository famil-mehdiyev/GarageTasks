import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task1
//        int[] ages = {11,58,63};
//        for(int i=0;i<ages.length;i++){
//            if(ages[i]%2==0){
//                System.out.println(ages[i]+ " "+"cut ededdir");
//            }else{
//                System.out.println(ages[i]+" "+"sade ededdir");
//            }
//        }
//Task2
//        int mod = 0;
//        int n = 0;
//        int tekEdedler = 0;
//        int count = 0;
//        int sum = 0;
//
//        int[] numbers = {23, 12, 31, 151};
//
//        for (int i = 0; i < numbers.length; i++) {
//
//
//            n = numbers[i];
//
//            while (n > 0) {
//                mod = n % 10;
//                n = n / 10;
//                sum += mod;
//
//
//            }
//            if (!(sum % 2 == 0)) {
//                tekEdedler += sum;
//                count++;
//            }
//            sum = 0;
//        }
//
//        System.out.println(tekEdedler / count);


//Task3

//        int max=0;
//
//        int[] arrays = {15,58,152,368,95};
//        for (int i=0;i<arrays.length;i++){
//
//            if (arrays[i]>max){
//                max=arrays[i];
//            }
//        }
//        System.out.println(max);
//    }
//Task4
//        int n = 0;
//
//        int mod = 0;
//
//        int count = 0;
//        int sum = 0;
//
//        int[] arr = {152, 25, 1, 600, 110, 11111};
//        for (int i = 0; i < arr.length; i++) {
//            n = arr[i];
//
//            while (n > 0) {
//
//                mod = n % 10;
//                sum += mod;
//
//                n = n / 10;
//
//                count++;
//
//            }
//            if (count > 2) {
//                System.out.println(sum);
//
//            }
//
//            count = 0;
//
//            sum = 0;
//        String[] names ={"Cingiz","Amal","Valide","Eli","Nicat","Mehemmed"};
//        for(var name:names){
//            if(name.length()>5){
//                System.out.println(name);
//            }
//        }

//        Task 2 verilen arrayi tersine cevirin

//        int[] arr = {1, 2, 3, 4};
//
//        int[] reverse = new int[arr.length];
//
//        for (int i = arr.length-1; i >= 0; i--) {
//
//            System.out.println(arr[i]);
//        }


//        Task3 Verilen arrayin elementlerinin sorted (kicikden boyuye dogru)olub olmadigini cap edin


//        int[] arr={3,2,3,4};
//boolean bool= true;
//        int[] correction=arr;
//        int correction1=0;
//        for(int i=arr.length-1;i>0;i--){
//
//                if(correction[i-1]>=correction[i]){
//                    bool=false;
//
//
//                }
//
//
//            }
//        if(bool==false){
//            System.out.println("unsorted");
//        }else{
//            System.out.println("sorted");
//        }


//        AzizTask1

//        int[] arr = {15,23,38,46,77,98};
//
//        int max=0;
//        int ikinciEded=0;
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                ikinciEded=max;
//                max=arr[i];
//
//            }
//
//        }
//        System.out.println(ikinciEded);

//        int temp=0;
//        int[] arr = {1, 2, 3, 1};
//
//        int[] unique = arr;
//        boolean bool=true; ;
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr.length; j++) {
//
//                if(bool==false){
//                    continue;
//                }
//                bool=true;
//                if (arr[i] == unique[j]) {
//                   bool=false;
//
//
//                }
//                System.out.println(unique[j]);
//            }
//
//    }

//        int[] array = {15, 250, 23, 457, 321, 875, 246, 190, 234, 800, 9837, 12531};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("input daxil edin");
//        int input = sc.nextInt();
//        int input2 = sc.nextInt();
//        int result = 0;
//        int lastNumber = 0;
//
//        int temp = 0;
//
//        for (int i = 0; i < array.length; i++) {
//
//            result = array[i];
//
//            if (result > input && result < input2) {
//                while (result > 0) {
//                    lastNumber = result % 10;
//                    result = result / 10;
//                    temp += lastNumber;
//                }
//            }
//            if (temp > 7) {
//                System.out.println(array[i]);
//            }
//            temp = 0;
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("1ci reqemi daxil edin");
//        int firstNumb=sc.nextInt();
//        System.out.println("2ci reqemi daxil edin");
//        int secondNumb= sc.nextInt();
//        System.out.println("emeliyyati daxil edin");
//        sc.nextLine();
//        String operation= sc.nextLine();

//        switch(operation){
//            case "*":
//                System.out.println(firstNumb*secondNumb);
//                break;
//            case "/":
//                System.out.println(firstNumb/secondNumb);
//                break;
//            case "+":
//                System.out.println(firstNumb+secondNumb);
//                break;
//            case "-":
//                System.out.println(firstNumb-secondNumb);
//                break;
//            default:
//                System.out.println("Error");
//        }

//        System.out.println("Ayin necenci ay oldugun daxil edin");
//        int fesil=sc.nextInt();
//        switch(fesil) {
//            case 12,1,2 -> System.out.println("Qish");
//            case 3,4,5 -> System.out.println("Yaz");
//            case 6,7,8 -> System.out.println("Yay");
//            case 9,10,11 -> System.out.println("Payiz");
//            default -> System.out.println("Error");
//        }

//        System.out.println("hansi Ay oldugunu qeyd edin");
//        String month= sc.nextLine();
//
//        switch(month){
//            case "yanvar","mart","May","iyul","avqust","oktyabr","dekabr"  ->System.out.println(31);
//            case "aprel","iyun","sentyabr","noyabr" -> System.out.println(30);
//            case "fevral"-> System.out.println("28 or 29");
//            default -> System.out.println("yeniden daxil edin");
//        }
//  Task 1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Rengi daxil edin");
//        String light = sc.nextLine();
//
//        switch (light){
//            case "Yashil"-> System.out.println("Hereket edin");
//            case "Qirmizi"-> System.out.println("Dayanin");
//            case "Sari" -> System.out.println("Hazirlashin");
//            default -> System.out.println("Sehv reng daxil edillib,yeniden daxil etmeye cehd edin");
//        }
        //Task 2

        Scanner sc = new Scanner(System.in);
        System.out.println("Valyutani daxil edin");
        String valyuta = sc.nextLine();
        System.out.println("Heddef valyutani daxil edin");
        String hedefValyuta = sc.nextLine();
        System.out.println("Deyeri daxil edin");
        int deyer = sc.nextInt();




        switch (valyuta) {
            case "Usd":{
                switch (hedefValyuta){
                    case "Azn" -> System.out.println(deyer*1.70 + ": azn");
                    case "Euro" -> System.out.println(deyer*0.92 + "euro");
                    default -> System.out.println("duzgun daxil edilmeyib");
                }

            }
            break;
            case "Azn":{
                    switch (hedefValyuta){
                        case "Usd" -> System.out.println(deyer*0.59);
                        case "Euro" -> System.out.println(deyer*0.54);
                        default -> System.out.println("duzgun daxil edilmeyib");
                    }

            }
            break;
            case "Euro" : {
                switch (hedefValyuta){
                    case "Usd" -> System.out.println(deyer *1.09);
                    case "Azn" -> System.out.println(deyer*1.85);
                    default -> System.out.println("duzgun daxil edilmeyib");
                }
            }
        }

    }
}

