package InterviewQu;

import java.util.HashMap;
import java.util.Map;

public class CountOfNumber {
    // We need to find how many times each word is used
    // Java coding Java coding is good
    // Java 2 coding 2 is 1 good 1
    static public Map<String, Integer> countOfWords(String sentence) {
        Map<String, Integer> countOfW = new HashMap<>();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (countOfW.containsKey(words[i])) {
                int count = countOfW.get(words[i]);
                countOfW.put(words[i], ++count);
            } else {
                countOfW.put(words[i], 1);
            }
        }
        return countOfW;
    }

    public static void main(String[] args) {
        String str = "Java coding Java coding is good";
        System.out.println(countOfWords(str));
    }
}