package IfStatement;

public class CurlyBrackets {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        if(a>b)      //// if not see { if the condition is false very following line will not be executed just only see second
            System.out.println("this is first lin of the code after if statement");
            System.out.println("second line code");

        if (a<b)      /// if true you can see bolt line
            System.out.println("this is first lin of the code after if statement");
            System.out.println("second line code");


    }
}
