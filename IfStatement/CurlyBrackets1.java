package IfStatement;

public class CurlyBrackets1 {
    public static void main(String[] args) {

       int x=5;
       int y=8;
       if (x>y)///false next line it will not work
           y++;////it will not work
       y--;//7
       y=x+y;//5+7
        System.out.println(y);//12
        if (y>x)
            y++;//13
        x++;//6
        System.out.println(--x+y);//18
        System.out.println(--x);//4
        System.out.println(x--);//4




    }
}
