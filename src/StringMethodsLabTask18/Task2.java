package StringMethodsLabTask18;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
    String text = "a::b::c::d::e";
    split(text);

    }
        public static void split(String text){
            String[] splits = text.split("::");
            System.out.println(Arrays.toString(splits));
        }


}
