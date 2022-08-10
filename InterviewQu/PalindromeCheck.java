package InterviewQu;

import java.util.Locale;

public class PalindromeCheck {
    //the palindrome is when the string is same from reverse too.
    //write a method that checks if the string is palindrome in a fastest way
    // if the string is palindrome last letter and the first letter should be same
    //second letter is same with second last letter
    //third letter is same with third last letter.
    public static boolean isPalindrome(String str){
        //i can find the reversed string and check if they equal to each other
        str=str.toUpperCase();
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);/////this one not fast way
        }
        return reverse.equals(str);
    }
    public static  boolean isPalindrome2(String str){  ///fast way
        ///in order to check last letter and first letter I need two index number
        str=str.toLowerCase();
        for (int i=0,k=str.length()-1;k>i;i++,k--){
            if (str.charAt(i)!=str.charAt(k)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome2("Hannah"));
    }
}
