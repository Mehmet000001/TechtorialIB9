package Arrays;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        /*
        print out the number pairs that their sum is 30
        {14,21,6,5,74,25,9,84,16}
        hint:nested for loop
        ex:14 and 16 makes 30
           21 and 9 makes 30
           25 and 5 makes 30
         */
        int [] number={14,21,6,5,74,25,9,84,16};


        for (int i=0;i<number.length;i++){
            for (int k=i+1;k<number.length;k++){///k=0;k<i;k++
                if (number[i]+number[k]==30){
                    System.out.println(number[i] +" and" +number[k]+" makes total of 30");

                }


                }
            }
        }
    }

