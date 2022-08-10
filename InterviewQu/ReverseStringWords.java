package InterviewQu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringWords {
    // Java coding questions
// questions coding Java
// Java
// Java
    public static String reverseWordOrder(String sentence) {
        List<String> words = Arrays.asList(sentence.split(" "));
        // In order to use reverse method we
        // need to convert our array to list
        String reverse = "";
        Collections.reverse(words);
        StringBuilder builder = new StringBuilder(sentence.length());
        for (int i = 0; i < words.size(); i++) {
            reverse += words.get(i);
            reverse += " ";
            builder.append(words.get(i));
            builder.append(" ");
        }
        return reverse;
    }

    public static void main(String[] args) {
        String str = "Java coding questions";
        System.out.println(reverseWordOrder(str));

    }
}