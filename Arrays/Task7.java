package Arrays;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        //{"red","yellow","blue","violet",Green"}
        //print out every element in reverse order
        //{"der","wolley",........}
        String[] str = {"red", "yellow", "blue", "violet", "Green"};
        String[] reversedArray=new String[str.length];////array for store
        String[] emailArray=new String[str.length];
        for (int i = 0; i < str.length; i++) {
            String reverse = "";
            for (int j = str[i].length() - 1; j >= 0; j--) {
                reverse += str[i].charAt(j); ///reverse string
            }
            System.out.println("\"" + reverse + "\"");
            reversedArray[i]=reverse;///red,wolley.....///reverse array
            emailArray[i]=reverse.concat("@yahoo.com");

        }
        System.out.println(Arrays.toString(reversedArray));
        System.out.println(Arrays.toString(emailArray));



    }
}
