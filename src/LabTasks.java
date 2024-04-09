import java.util.Scanner;

public class LabTasks {
    public static void main(String[] args) {
//     Task1

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
//            }else if(i<ikinciEded&&i!=max){
//                ikinciEded=i;
//            }
//
//        }
//        System.out.println(ikinciEded);

//
//        int[] arr = {1, 2, 3, 7, 5, 1};
//
//
//        int count = 0;
//
//
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//
//                }
//
//            }
//            if(count==1){
//                System.out.println(arr[i]);
//            }
//
//
//            count = 0;
//        }

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
//        System.out.println("Istifadecinin  adini daxil edin");
//        String ad = sc.nextLine();
//        System.out.println("bali daxil edin");
//        int bal = sc.nextInt();
//
//      if(bal>=0&&bal<=50){
//            System.out.println(ad + ":"+"aldigi qiymet : F");
//        }else if(bal>=51&&bal<=60){
//            System.out.println(ad + ":"+"aldigi qiymet :  E");
//        }else if(bal>=61 &&bal<=70){
//            System.out.println(ad + ":"+"aldigi qiymet :  D");
//        }else if(bal>=71&&bal<=80){
//            System.out.println(ad + ":"+"aldigi qiymet :  C");
//        }else if(bal>=81&&bal<=90){
//            System.out.println(ad + ":"+"aldigi qiymet :  B");
//        } else if (bal>=91&& bal <=100) {
//            System.out.println(ad +" "+"aldigi qiymet :  A");
//        }else{
//            System.out.println("Systemde  nasazliq var");
//        }

//        System.out.println(" reqemleri  daxil edin");
//        int numb = sc.nextInt();
//        int count = 0;
//        int lastnumber = 0;
//        int temp = 0;
//
//
//        temp = numb;
//        while (temp > 0) {
//            lastnumber = temp % 10;
//
//            temp = temp / 10;
//            count++;
//        }
//        lastnumber=0;
//        if(count<4){
//            return;
//        }
//
//        int[] arr = new int[count];
//        for (int i = 0; i < arr.length; i++) {
//            while (numb > 0) {
//                lastnumber = numb % 10;
//                arr[i] = lastnumber;
//                numb = numb / 10;
//                System.out.print(arr[i]);
//            }
//
//        }
//int[] arr = {25,15,65,9,32,157,854};
//
//        int[] arrCopy=new int[arr.length];
//
//        for(int i=0;i<arr.length;i++){
//            arrCopy[i]=arr[i];
//
//        }
//        for (int copy :arrCopy) {
//            System.out.println(copy);
//        }

//        int[] arr = {25, 15, 65, 897, 25, 65, 124};
//        int count = 0;
//        int count1 = 0;
//
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//
//
//            }
//            if (count < 2) {
//
//                count1++;
//
//            }
//
//
//
//
//            count = 0;
//
//        }
//        for (int b=0;b< arr.length;b++){
//            if (count < 2) {
//                int[] array1 = new int[count1];
//                for (int a = 0; a < array1.length; a++) {
//                    array1[a] = arr[a];
//                    System.out.println(array1[a]);
//
//                }
//
//                System.out.println(array1.length);
//            }
//        }
        //Task 12
//        System.out.println("hansi Ay oldugunu qeyd edin");
//        String month= sc.nextLine();
//
//        switch(month){
//            case "yanvar","mart","May","iyul","avqust","oktyabr","dekabr"  ->System.out.println(31);
//            case "aprel","iyun","sentyabr","noyabr" -> System.out.println(30);
//            case "fevral"-> System.out.println("28 or 29");
//            default -> System.out.println("yeniden daxil edin");
//        }

//        System.out.println("Take number");
//        int number = sc.nextInt();
//
//        while(number<1){
//            System.out.println("Eded 1den balacadir");
//        }
//        switch (number) {
//            case 1, 2, 3, 4, 5 -> System.out.println("1-5 araligindadir");
//            case 6,7,8,9,10 -> System.out.println("5-10 araligindadir");
//            default -> System.out.println("10dan boyukdur");
//
//        }

//        char[] arr = {'a', 'ı', 'o', 'u', 'e', 'ə', 'i', 'ö', 'ü'};
//
//        for (int i = 0; i < arr.length; i++) {
//            switch (arr[i]) {
//                case 'i', 'ı', 'u', 'ü' -> System.out.println( arr[i] + "-"+"Qapali saitdir");
//                case 'o', 'a', 'ö', 'e', 'ə' -> System.out.println(arr[i] +"-" +"Aciq saitdir");
//            }
//        }

//    int max=0;
//    int secondMax=0;
//    int min = Integer.MAX_VALUE;
//    int secondMin=Integer.MAX_VALUE;
//
//    int[] array={56,98,544,632,8745,122,7895,5698,23};
//
//    for(int i=0;i< array.length;i++){
//        if(max<array[i]){
//            secondMax=max;
//            max=array[i];
//
//        }
//        if(array[i]>secondMax&&array[i]!=max){
//            secondMax=array[i];
//        }
//
//        if(min>array[i]){
//            secondMin=min;
//            min=array[i];
//        }
//        if(array[i]<secondMin&&array[i]!=min){
//            secondMin=array[i];
//        }
//    }
//
//
//    int sumMax =max+secondMax;
//    int sumMin = min+secondMin;
//
//    Scanner sc = new Scanner(System.in);
//        System.out.println("Operasiyani daxil edin");
//
//        String operation =  sc.nextLine();
//        switch(operation){
//            case "+" -> System.out.println(sumMax+sumMin);
//            case "-" -> System.out.println(sumMax-sumMin);
//            case "/" -> System.out.println(sumMax/sumMin);
//            case "*" -> System.out.println(sumMax*sumMin);
//            default -> System.out.println("Error");
//
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("1-ci istifadecinin adini daxil edin");
        String userName1 = sc.nextLine();
        System.out.println("1-ci Istifadecinin soyadini daxil edin");
        String userSurname1 = sc.nextLine();
        System.out.println("1-ci istifadecinin yawini daxil edin");
        byte userAge1=sc.nextByte();
        System.out.println("1-ci Userin pulunu daxil edin");
        double userMoney1 = sc.nextDouble();

        sc.nextLine();
        System.out.println("2-ci istifadecinin adini daxil edin");
        String userName2 = sc.nextLine();
        System.out.println("2-ci istifadecinin soyadini daxil edin");
        String userSurname2 = sc.nextLine();
        System.out.println("2-ci istifadecinin yawini daxil edin");
        byte userAge2=sc.nextByte();
        System.out.println("2-ci Userin pulunu daxil edin");
        double userMoney2 = sc.nextDouble();


        while (true) {
            System.out.println("medaxili daxil edin");
            double moneyOperation = sc.nextDouble();
            System.out.println("emeliyyati daxil edin");
            int operation = sc.nextInt();

            switch (operation) {
                case 1: {
                    if (userMoney1 > moneyOperation) {
                        System.out.println(userName1 +" " +userSurname1 +" to " +" "+ userName2+ " "+userSurname2);
                        userMoney2 += moneyOperation;
                        userMoney1 -= moneyOperation;
                    } else {
                        System.out.println("sizin balansiniz  kifayet deyil");
                    }
                    break;
                }
                case 2: {
                    if (userMoney2 > moneyOperation) {
                        System.out.println(userName2 +" " +userSurname2 +" to " + userName1+ " "+userSurname1);
                        userMoney2 -= moneyOperation;
                        userMoney1 += moneyOperation;
                    } else {
                        System.out.println("balansiniz  kifayet deyil");
                    }
                    break;
                }
                case 3: {
                    System.exit(0);
                }
            }

            System.out.println(userName1 + " :" + userMoney1);
            System.out.println(userName2 + " :" + userMoney2);
        }

    }
}


