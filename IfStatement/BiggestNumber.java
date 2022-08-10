package IfStatement;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
       ///ask user to enter three numbers
       // find the biggest number amount those three entries
       //print out the biggest number ---->"Biggest number is " + biggest number

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter numbers");
        int number1=input.nextInt();
        System.out.println("please enter number");
        int number2=input.nextInt();
        System.out.println("please enter number");
        int number3=input.nextInt();
        if (number1>number2 && number1>number3){
            System.out.println("number biggest" + number1);
        }else if (number2>number1 && number2>number3){
            System.out.println("number biggest"+number2);
        }else{
            System.out.println("number biggest"+number3);

        }







    }
}
