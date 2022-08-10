package Arrays;

public class Task4 {
    public static void main(String[] args) {
        /*
        find the largest/biggest number from given array
        {4,6,22,40,1,100,43,10,-25}
         */
        int[] number={4,6,22,40,1,100,43,10,-25};
        int largest=number[0];
        int smaller=number[0];
        for (int index=0;index<number.length;index++){
            if (number[index]>largest){
                largest=number[index];
            }
            if (smaller>number[index]){
                smaller=number[index];
            }
        }
        System.out.println("the biggest number is "+largest);
        System.out.println("The smaller number is "+smaller);
    }
}
