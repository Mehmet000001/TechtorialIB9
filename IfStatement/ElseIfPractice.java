package IfStatement;

import java.util.Scanner;

public class ElseIfPractice {
    public static void main(String[] args) {
      //pick a number between 0 to 25
      // if number is included between 0-5 is print your number in the range of 0-5
        // if number is included between 0-10 print your number in the range of 6-10
        // if number is included between 10-15 print your number in the range of 11-15

        // if number is included between 15-20print your number in the range of 16-20
        // if number is included between 20-25 print your number in the range of 21-25
        System.out.println("please chose a number between 0-25");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        if (number>=0 && number<=5){
            System.out.println("your number in the range of 0-5 ");
        }else if (number>5 && number<10){
            System.out.println("your number in the range of 5-10");
        } else if (number>10 && number<15) {
            System.out.println("your number in the range of 10-15");
        } else if (number>15 && number<20) {
            System.out.println("your number in the range of 15-20");
        } else if (number>20 && number<25) {
            System.out.println("your number in the range of 20-25");
        }else{
            System.out.println("your number is out of range");
        }

    }
}
