package IfStatement;

import java.util.Scanner;

public class ElseTask2 {
    public static void main(String[] args) {
        /*
        find out whether your zip code is an even number or not
        -when zipcode is even print your zipcode is an even number
        otherwise print your zipcode is odd number
         */
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your zipcode");
        int zipCode=input.nextInt();
        if (zipCode%2==0){
            System.out.println("your zipcode is an even number");
        }else{
            System.out.println("your zipcode is odd number");
        }



    }
}
