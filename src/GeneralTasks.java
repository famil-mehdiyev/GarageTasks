import java.util.Scanner;

public class GeneralTasks {
    public static void main(String[] args) {
//        Task  1
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



//        Task 2 verilen arrayi tersine cevirin
//
//        int[] arr = {1, 2, 3, 4};
//
//        int[] reverse = new int[arr.length];
//
//        for (int i = arr.length-1; i >= 0; i--) {
//
//            System.out.println(arr[i]);
//        }




//        Task3 Verilen arrayin elementlerinin sorted (kicikden boyuye dogru)olub olmadigini cap edin



//        int[] arr={1,1,2,4};
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

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Istifadecinin  adini daxil edin");
//        String ad = sc.nextLine();
//        System.out.println("bali daxil edin");
//        int bal = sc.nextInt();
//
//        if(bal>=0&&bal<=50){
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

//        Task 1 04.04.2024
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
// Task 2 04.04.2024
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Valyutani daxil edin");
//        String valyuta = sc.nextLine();
//        System.out.println("Heddef valyutani daxil edin");
//        String hedefValyuta = sc.nextLine();
//        System.out.println("Deyeri daxil edin");
//        int deyer = sc.nextInt();
//
//
//
//
//        switch (valyuta) {
//            case "Usd":{
//                switch (hedefValyuta){
//                    case "Azn" -> System.out.println(deyer*1.70 + ": azn");
//                    case "Euro" -> System.out.println(deyer*0.92 + " : euro");
//                    default -> System.out.println("duzgun daxil edilmeyib");
//                }
//
//            }
//            break;
//            case "Azn":{
//                switch (hedefValyuta){
//                    case "Usd" -> System.out.println(deyer*0.59);
//                    case "Euro" -> System.out.println(deyer*0.54);
//                    default -> System.out.println("duzgun daxil edilmeyib");
//                }
//
//            }
//            break;
//            case "Euro" : {
//                switch (hedefValyuta){
//                    case "Usd" -> System.out.println(deyer *1.09);
//                    case "Azn" -> System.out.println(deyer*1.85);
//                    default -> System.out.println("duzgun daxil edilmeyib");
//                }
//            }
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Arrayin nece olculu oldugunu qeyd edin");
        int capacity = sc.nextInt();

        int[] arr = new int[capacity];

        for(int i=0;i< arr.length;i++){
            System.out.println(i+ " elementi daxil edin");
            arr[i]=sc.nextInt();

        }


    int max =0;
    int factorial =1;
    for(int a =0;a<arr.length;a++){
        if(arr[a]>max)
            max=arr[a];
    }
        System.out.println("maksimum eded "+max);
    if(!(max%2==0)){
        System.out.println(max);
    }else{
        for(int j=max;j>=1;j--){
            factorial*=j;
        }
    }
        System.out.println("ededin factoriali "+factorial);

    }
}
