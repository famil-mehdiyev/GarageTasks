package StringMethodsLabTask18;

public class Task3 {
    public static void main(String[] args) {
    String text ="a b,c.d/e";
    characterLetter(text);
    }
    public static void characterLetter(String text){
        String notes ="";
       for(int i =0;i<text.length();i++){

          boolean b1= Character.isLetter(text.charAt(i));
             if (b1 ){
                 System.out.print(text.charAt(i)+ " ");
             }
       }

    }

}
