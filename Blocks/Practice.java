package Blocks;

public class Practice {
    String name;
    static  int budget;

    static {///static block
        budget=4567889;//initialize
        System.out.println("This is static block");///static block first work before everything
        System.out.println(budget);
    }
    {///instance block
        name="BOA";
        System.out.println("This is instance block");
        System.out.println(name);
    }

    public static void main(String[] args) {
        Practice o1=new Practice();
        Practice o2=new Practice();
        Practice o3=new Practice();
        Practice o4=new Practice();
        Practice o5=new Practice();
        System.out.println(o5.name);


    }

}
