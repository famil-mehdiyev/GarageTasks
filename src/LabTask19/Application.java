package LabTask19;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text= sc.nextLine();

//      programProccessing(text);
      isPalindrome(text);
      splitText(text);
//     String reversedText1= reversedText(text);
//        System.out.println(reversedText1);
        mostUsingCaharacter(text);
    }
    public static void programProccessing(String  text){

        System.out.println("length :"+ text.length());
       if(text.isEmpty()){
           System.out.println("text boshdur");
       }else{
           System.out.println("bosh deyil");
       }
        System.out.println("Lowercase : "+text.toLowerCase());
        System.out.println("Uppercase : "+text.toUpperCase());
        if(text.contains("Salam")){
            System.out.println("Iceride Salam sozu var");
        }else System.out.println("yoxdur");
        System.out.println("first 5 character : " +text.substring(0,5));

        System.out.println("last 5 character : "+text.substring(text.length()-5));
        System.out.println("Alternativ alt setir : "+text.substring(text.length()/2,text.length()-5));
        System.out.println("Concat : "+text.concat("GarageAcademy.nin  telebeleri"));
        System.out.println("replace :"+ text.replace('a','e'));

    }

    public static String reversedText (String text){
        String reversedText="";
        for (int i=text.length();i>=0;i--){
            reversedText+=text.charAt(i);
        }
        return reversedText;
    }

    public static void splitText(String text){
        String[] splitedText = text.split(" ");
        for(String s:splitedText)
            System.out.println(s);

    }
    public static void isPalindrome(String text){
        String reversedText="";
        for (int i=text.length()-1;i>=0;i--){
            reversedText+=text.charAt(i);
        }
        if(text.equalsIgnoreCase(reversedText)){
            System.out.println("Palindromdur");
        }else System.out.println("Palindrom deyil");

    }

    public static void mostUsingCaharacter(String text){
        int arr[]=new int[text.length()];
        int maxValue = Integer.MIN_VALUE;
        int count=0;
        char mostUsing = 'a';
        for(int i=0;i<text.length();i++){
            for(int j=0;j<text.length();j++){
                if(text.charAt(i)==text.charAt(j)){
                    count++;
                  if(maxValue<count){
                      maxValue=count;
                      mostUsing=text.charAt(i);
                  }

                }
            }
            count=0;
        }


        System.out.println(mostUsing);
    }

}
// ifde charrin c-si