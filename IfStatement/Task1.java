package IfStatement;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        /*
         ///ask user to provide the time in the following format 5 am/pm
        if user enters pm time;
        such as---8pm
        "Good afternoon"
        if user enters am time;
        such as----2 am
        "Good morning"
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please provide the time as:5 am/5pm");
        String time=input.nextLine().toLowerCase();
        if (time.contains("am")){
            System.out.println("Good morning");
        }
        if (time.contains("pm")){
            System.out.println("Good Afternoon!");
        }
        if (!time.contains("am") && !time.contains("pm")){
            System.out.println("Please check your entry format it does not match with requirements");
        }

    }
}
