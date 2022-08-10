package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) throws FileNotFoundException ,InterruptedException{
        FileInputStream file=null;
        file=new FileInputStream("Test.txt");
        Scanner scanner=new Scanner(file);



        int money=50;
        int item=100;
        if (money<item){
            throw new NullPointerException();
        }
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        Thread.sleep(5000); //if put 5000 time after it will work InterruptedException.
        System.out.println("This will print after 2 seconds of sleep");
    }
}
