package Loops;

public class ForPrintLetters {
    public static void main(String[] args) {
        /// by using for loop print each letter from a given string
        //out put :t,o,d,.....
        // print the numbers form 0 the strings length
        // print only letter 'o' from this string
        // count amount of capital letter 'B' s from
        // this string and print that count output:there are 2 Bs in this string

        String str="Today is the best day for Java not for BBQ";

        for (int i=0;i<str.length();i++){
            System.out.println(str.charAt(i)+",");//T     //if you take out ln(println) letter it will show the same line right to left
            System.out.println(i+"*");
        }
        for (int i=0;i<str.length();i++){ //
            if (str.charAt(i)=='o'){
                System.out.println(str.charAt(i));
            }


        }
        int count=0;
        for (int t=0;t<str.length();t++){
            if (str.charAt(t)=='B'){
                count++;

            }
        }
        System.out.println("there are "+count+" letter B in the string");//local variable just use the same local you can not rich out


    }
}
