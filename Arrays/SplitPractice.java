package Arrays;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {
        String test = "Java is super easy!";
//        String newTest = test.toUpperCase();
//        boolean b = test.equals(newTest);
// split method give us array results .
        String[] array = test.split(" ");
        System.out.println(Arrays.toString(array));
        String[] array1=test.split("a");
        System.out.println(Arrays.toString(array1));
        System.out.println(array1.length);///we have 4 elements
        // "I want to solve every java question by myself.That would be great moment. And,I will have a party."    you have to \\. before split .

        String sentence ="I want to solve every java question by myself.That would be great moment. And,I will have a party.";// if you put \n new line \t new tap
        System.out.println("I want to solve every java question by myself.\nThat would"+" be great moment.\t And,\"I will have a party.\"");
        String[] sentences=sentence.split("\\.");
        System.out.println(Arrays.toString(sentences));


        /// "06.19.2021"---check if the day is  19  ---print :"Yaayyyy!"

        String date="06.19.2021";
        String[] splitedDate=date.split("\\.");
        if (splitedDate[1].equals("19")){//if you indexing after split 19 indexing 1 we put [1]
            System.out.println("Yaayyy");
        }




    }
}
