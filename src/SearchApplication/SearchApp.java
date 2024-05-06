package SearchApplication;

import java.util.Scanner;

public class SearchApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] dataFullName = new String[5];


        while (true) {
            System.out.println("""
                    1 . Add Fullname!
                    2 . Searching!
                    """);

            System.out.println("Operationu daxil edin");
            int operations = sc.nextInt();
            sc.nextLine();


            switch (operations) {
                case 1: {
                    System.out.println("Add Fullname");
                    String nameAndSurname = sc.nextLine();
                    addFullName(dataFullName, nameAndSurname);
                    break;
                }
                case 2: {
                    System.out.println("Search elediyiniz herfi daxil edin");
                    String search = sc.nextLine();
                    searchData(search, dataFullName);
                    break;
                } default :{
                    System.out.println("Dogru operationu daxil edin");
                }
            }
//            System.out.println("Davam etmek isteyirsinizmi?");
//            String continued = sc.nextLine();
//            switch (continued) {
//                case "y": {
//                    continue;
//                }
//                case "n": {
//                    System.exit(0);
//                }

        }
    }


    public static void addFullName(String[] dataArray, String nameAndSurname) {
        for (int i = 0; i < dataArray.length; i++) {
            if (dataArray[i] == null) {
                dataArray[i] = nameAndSurname;
                System.out.println(dataArray[i]);
                break;
            }
        }
    }

    public static void searchData(String text, String[] dataFullName) {
        for (int i = 0; i < dataFullName.length; i++) {

            if (dataFullName[i] != null && dataFullName[i].contains(text)) {
                System.out.println(dataFullName[i]);
            }
        }

    }
}
