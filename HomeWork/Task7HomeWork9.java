package HomeWork;

import java.util.Scanner;

public class Task7HomeWork9 {
    public static void main(String[] args) {
        //Write a program in Java to make such a pattern like a pyramid with numbers increased
// by 1. For this task ask the user to enter a number of the line.
//        Example:
//        Please enter line number: 4
//        Expected output:
//        1
//        23
//        456
//        7 8 9 10
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide number of line");
        int limitOfLineNumber = scanner.nextInt();
        for (int number = 1, currentLineNumber = 1; currentLineNumber <= limitOfLineNumber; currentLineNumber++) {
            for (int i = currentLineNumber; i > 0; i--) {
                System.out.print(number++);
            }
            System.out.println();
        }
    }
}