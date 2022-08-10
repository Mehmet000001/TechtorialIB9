package Exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        try {
            FileInputStream file=null;
            file=new FileInputStream("Test.txt");
            Scanner scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException xx){
            System.out.println(  xx.getMessage());//if you Test change this method show inside exception
            System.out.println(Arrays.toString(xx.getStackTrace()));
            System.out.println(xx.getCause());
            System.out.println("File not found");
        }finally {
            System.out.println("I am finally block and I am finally done!");

        }
    }
}
