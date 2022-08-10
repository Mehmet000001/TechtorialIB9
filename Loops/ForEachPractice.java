package Loops;

public class ForEachPractice {
    public static void main(String[] args) {
        String[] colors={"red","green","violet","pink","white"};
        for (String color:colors){///this loop start to last one every time loop a sing by one by
            System.out.println(color);
            System.out.println(color.toUpperCase());

        }
        //find the sum of numbers in the array
        // int [] numbers ={5,6,7,8,12,23,34};
        int [] numbers={5,6,7,8,12,23,34};
        int sum=0;
        for (int num:numbers){
            sum+=num;
            System.out.println(num);


        }
        System.out.println("This is sum: "+sum);
    }
}
