package IfStatement;

import java.util.Scanner;

public class ElseTask {
    public static void main(String[] args) {

        // ask user if they have driver license
        // if they have print "you are great"
        // otherwise print "you should have license before getting on the road"
        Scanner input=new Scanner(System.in);
        System.out.println("Do you have Drivers license?yes/no");
        String license=input.next();
        if (license.equalsIgnoreCase("yes")){///equalsIgnoreCase bc capital or lower case
            System.out.println("you are great");
        }else{

            System.out.println("you should have license before getting on the road");
        }



    }
}
