package IfStatement;

import java.util.Scanner;

public class NestedIfPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("welcome do you know java? enter yes/no");
        String Java = input.next();
        if (Java.equalsIgnoreCase("yes")) {
            System.out.println("do you know selenium");
            String selenium=input.next();
            if (selenium.equalsIgnoreCase("yes")){
                System.out.println("do you know api testing yes/no");
                String api=input.next();
                if (api.equalsIgnoreCase("yes")){
                    System.out.println("do you sql yes / no");
                    String sql=input.next();
                    if (sql.equalsIgnoreCase("yes")){
                        System.out.println("congrats you got hired");
                    }else{
                        System.out.println("we are looking for someone who knows sql");
                    }
                    }else{
                    System.out.println("we are looking for someone who knows api testing");
                }
            }else {
                System.out.println("we are looking for someone who knows selenium");
            }
        } else {
            System.out.println("we are looking for someone who knows java");

        }
    }
}