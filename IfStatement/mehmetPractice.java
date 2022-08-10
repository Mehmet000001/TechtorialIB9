package IfStatement;

import java.util.Scanner;

public class mehmetPractice {
    public static void main(String[] args) {

        boolean passports = true;
        boolean visa = true;
        boolean ticket = true;
       if (passports){
           if (visa){
               if (ticket){
                   System.out.println("good news you can fly");
               }

           }else{
               System.out.println("you should get visa");
           }

       }else if (!passports){
           System.out.println("you should get visa");
       }




    }


}