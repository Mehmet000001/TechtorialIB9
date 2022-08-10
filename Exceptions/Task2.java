package Exceptions;

public class Task2 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {


        int[] number = {1, 3, 4, 6};
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i ]);
            if (number[i] < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
        }
    }
}