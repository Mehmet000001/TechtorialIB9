package Exceptions;

public class Error {
    public static void myMethod() {
        System.out.println("I am in my method");

        try {
            myMethod();
        } catch (Throwable e) {
            System.out.println("Out of memory");
        }
    }
    public static void main(String[] args) {
        myMethod();
        System.out.println("You should not handle Error");
    }
}
