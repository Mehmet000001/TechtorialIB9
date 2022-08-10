package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        ask user to enter how many names she or he wants to store in an array
        -ask user that many names and
        -store those  names to the array by getting from user
        -print out by using .toString() method
         */
        // String [] names= new String[number];
        Scanner input=new Scanner(System.in);
        System.out.println("how many names do you want to store in array");
        int size=input.nextInt();
        String [] names=new String[size];

        for (int i=0;i<size;i++){
            System.out.println("Please enter "+(i+1)+". name");
            names[i]=input.next();
        }
        System.out.println(Arrays.toString(names));
    }
}
