package InterviewQu;

public class IfTheStringContainsAllVowel {
    //write a method that checks if the string contains any vowel
    public boolean containsAnyVowel(String str){
        String vowels="aeiou";
        for (int i=0;i<str.length();i++){
            String currentChar=str.charAt(i)+"";
            if (vowels.contains(currentChar)){
                return true;
            }
        }
        return false;
    }
    /// .mathces() method when you provide the string in this method

    public  boolean contains2(String str){
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}
