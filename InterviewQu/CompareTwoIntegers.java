package InterviewQu;

public class CompareTwoIntegers {
    public static void main(String[] args) {
        //int num1 = 2345; // 2 + 3 = 5
        //int num2 = 12;
        System.out.println(solution(2345,12));
    }

    public static boolean solution(int num1, int num2) {

        String[] numbers = ("" + num1).split(""); // "1234"
        int[] nums = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int q = i + 1; q < nums.length; q++) {
                if (nums[i] + nums[q] == num2) {
                    return true;
                }
            }
        }
        return false;
    }

}
