package Arrays;

public class SplitPractice1 {
    public static void main(String[] args) {
        /*
        The rock martin (Ptyonoprogne fuligula) is a small swallow that is resident in central and southern Africa.
         It breeds in the mountains, and at lower levels in rocky areas and towns. It has mainly brown plumage and white "windows" on the spread tail.
         Its call is a soft twitter. The sexes are similar in appearance. The martin hunts along cliff faces for flying insects.
          It breeds under cliff overhangs or on man-made structures using mud pellets to build a bowl or half-bowl nest with a soft lining.
          The bird is a solitary breeder, but small groups may nest close together in suitable locations.
          A typical clutch has two to three eggs, which are white with brown and grey blotches. Both adults incubate the eggs for 16–19 days and feed the chicks.
           Fledging takes another 22–24 days. The small martin is caught in flight by several falcons, such as hobbies.

        final and print out the words that has odd number of letter
        the,takes,...

         */


        String test="The rock martin (Ptyonoprogne fuligula) is a small swallow that is resident in central and southern Africa. It breeds in the mountains, and at lower levels in rocky areas and towns. It has mainly brown plumage and white \"windows\" on the spread tail. Its call is a soft twitter. The sexes are similar in appearance. The martin hunts along cliff faces for flying insects. It breeds under cliff overhangs or on man-made structures using mud pellets to build a bowl or half-bowl nest with a soft lining. The bird is a solitary breeder, but small groups may nest close together in suitable locations. A typical clutch has two to three eggs, which are white with brown and grey blotches. Both adults incubate the eggs for 16–19 days and feed the chicks. " +
               "Fledging takes another 22–24 days. The small martin is caught in flight by several falcons, such as hobbies.";
//        for (int i=0;i<test.length();i++){
//            if (!Character.isAlphabetic(test.charAt(i))&&!Character.isDigit(test.charAt(i))){
//               test.replace(test.substring(i,i+1),"");
//            }
//        }
        test=test.replace(",","");
        test=test.replace("(","");
        test=test.replace(")","");
        test=test.replace(".","");
        test=test.replace("\"","");


        String []  words=test.split(" ");
        int count=0;
        for (int i=0;i<words.length;i++){
            if (words[i].length()%2!=0){
                count++;
                System.out.println(words[i]);
            }

        }
        System.out.println(count);









    }
}
