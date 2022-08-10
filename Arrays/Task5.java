package Arrays;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        /*
        String[] names{"Davis","Jake","Jessi","sara","Dominic"};
        outcome in an array :[david@gmail.com,......
        store those e-mail in an array,then print them out as array
         */
        String[] names={"Davis","Jake","Jessi","Sara","Dominic"};
        String[] email=new String[names.length];

        for (String num:names){
            System.out.println(num.toLowerCase().concat("@gmail.com"));

        }
        for (int i=0;i<email.length;i++){
            email[i]=names[i].toLowerCase().concat("@gmail.com");

        }
        System.out.println(Arrays.toString(email));


    }
}
