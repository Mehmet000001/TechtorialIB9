package HomeWork;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter mount number");
        String mount=input.nextLine().toLowerCase().concat("February");
        System.out.println("please enter year number");
        String year=input.nextLine();
        int day=29;
        System.out.println("This your mount year and day"+mount+ " "+year+" has "+day+" days");

    }
}

