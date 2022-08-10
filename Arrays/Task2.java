package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        TASK: Ask user to enter how many names of people to store
        -store them in an String Array
        if the name is longer than 5 chars store it in --> longNames array
        otherwise store it in
        --> shortNames array
        -print out by using toString method

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter how many names of people to store");
        int number=input.nextInt();
        String [] shortnames=new String[number];
        String [] longName=new String[number];
       for (int i=0;i<number;i++){
           System.out.println("please enter "+(i+1)+"name");
           String name=input.next();

           if (name.length()>5){
               longName[i]=name;
           }else {
               shortnames[i]=name;
           }
       }
        System.out.println("long names:"+Arrays.toString(longName));
        System.out.println("short names:"+Arrays.toString(shortnames));
    }
}
