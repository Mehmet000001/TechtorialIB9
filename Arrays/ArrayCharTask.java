package Arrays;

import java.util.Arrays;

public class ArrayCharTask {
    public static void main(String[] args) {
        /*
        create a char array and print out only number from this array{'v','A','8','T','4',.....}
         */
        char []  arr={'v','A','8','T','4','&','2','L'};

        for (int i=0;i<arr.length;i++){

            if (arr[i]>='0'&& arr[i]<='9'){
                System.out.println(arr[i]);
            }


        }
        //isAlphabetical()---if that char is letter or not
        //isDigits()----if that char is numerical or not ------they are coming character class.
        Character.isAlphabetic('a');//true boolean
        Character.isDigit('a');///false

        for (int i=0;i<arr.length;i++){
            if (Character.isDigit(arr[i])){
                System.out.println(arr[i]);
            }

        }
        for (char ch:arr){////foreach
            if (Character.isDigit(ch)){
                System.out.println(ch);
            }
        }
        for (char element:arr){
            if (!Character.isDigit(element) && !Character.isAlphabetic(element)){// find number or letters.
                System.out.println(element);
            }
        }



        }




    }

