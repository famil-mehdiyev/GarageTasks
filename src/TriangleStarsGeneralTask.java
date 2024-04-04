public class TriangleStarsGeneralTask {
    public static void main(String[] args) {
        String[][] strArr = new String[5][10];

        int count = 1;
        for (int i = 0; i < strArr.length; i++) {
            for(int b=0;b<strArr[i].length-i;b++)
                System.out.print(" ");
            for (int a = 0; a < count; a++) {
                System.out.print(strArr[i][a] = "*");
            }
            count += 2;
            System.out.println(" ");
        }
    }
}

