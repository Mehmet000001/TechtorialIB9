package HomeWork;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("what is your age");
        int age=scanner.nextInt();
        scanner=new Scanner(System.in);
        System.out.println("Please provide your full name");
        String name=scanner.nextLine();
        System.out.println("Please provide state code");
        String code=scanner.nextLine();
        System.out.println("Please provide gender");
        String gender=scanner.nextLine();
        System.out.println("Please provide your city");
        String city=scanner.nextLine();
        int length=city.length();
        boolean amIVote=(age>18 && name.startsWith("A") && name.endsWith("V")&& code.startsWith("I") && code.endsWith("L")&&length<10 && gender.equals("M"));
        System.out.println(amIVote);


    }
}
