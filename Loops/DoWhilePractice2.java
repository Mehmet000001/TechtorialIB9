package Loops;

public class DoWhilePractice2 {
    public static void main(String[] args) {
        /*
        count the number letters and other chars from a given string
        Ex: String str="#$2$46svb%^&7Fth%6"
        sout("there are ......numbers in the .....")
        sout("there are ......letter in the ......")
        sout("there are ....other chars in the ....")
         */
        String str="#$2$46svb%^&7Fth%6";
        int index=0;
        int letterCount=0;
        int numberCount=0;
        int othersCount=0;



        do {
           boolean letter= str.charAt(index)>='A' && str.charAt(index)<='Z' || str.charAt(index)>='a' && str.charAt(index)<='z';
         if (letter){
             letterCount++;
         }
         boolean number=str.charAt(index)>='0' && str.charAt(index)<='9';
         if (number){
             numberCount++;
         }
        boolean others= !letter && !number;
         if (others){
             othersCount++;
         }
         index++;
        }while (index<str.length());

        System.out.println("There are"+letterCount+"letters in the string"+ str);
        System.out.println("There are"+numberCount+"numbers in the string"+ str);
        System.out.println("There are"+othersCount+"others in the string"+ str);


    }
}
