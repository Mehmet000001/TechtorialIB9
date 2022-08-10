package InterviewQu;

import java.util.Arrays;

public class PerformBinarySearch {
    //write a method that finds the element with binary search from array
    // Write a method that finds the element with binary search from array
    public static int performBinarySearch(int[] array, int value) {
        Arrays.sort(array);
        int low = 0;
        int high = array.length - 1;
        // {2,5,6,7,8,9,10}
        while (high >= low) {
            int middle = (low + high) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (array[middle] < value) {
                low = middle + 1;
            } else if (array[middle] > value) {
                high = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 6, 7, 8, 9, 10};
        int value = 5;
        int theIndexNumber = performBinarySearch(array, value);
        System.out.println(theIndexNumber);
        if (theIndexNumber == -1) {
            System.exit(-1);
        }
    }

}
