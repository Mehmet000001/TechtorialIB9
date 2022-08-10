package HomeWork;

public class Task4HomeWork9 {
    public static void main(String[] args) {
//    Write a program in Java to find the prime numbers within a range of numbers.
//    Test Data :Input starting number of range: 1 Input ending number of range : 50
//    Expected Output :
//    The prime number between 1 and 50 are :
//            2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
            // Prime number is a number that can only be divided by itself and one.
            // Non-prime numbers can be divided by one and itself
            // If the number cannot be divided by any number except itself and the one then this number is a prime
            int startingPointOfRange = 24;
            int endingPointOfRange = 50;
            for (;startingPointOfRange<=endingPointOfRange;startingPointOfRange++){
                boolean isPrime= true;
                // In order to understand if this is a prime I need to try to divide this number
                // with any possible divider and non of them can divide it means this is a prime number.
                // Possible dividers equal or smaller than half of the  number and bigger than one .
                Inner: for (int possibleDivider=startingPointOfRange/2;possibleDivider>1;possibleDivider--){
                    if (startingPointOfRange%possibleDivider==0){
                        // It  means this number can be divisible by this possible divider.
                        // We already know this number is not a prime
                        isPrime=false;
                        System.out.println(startingPointOfRange+"THis not a prime number");
                        break Inner;
                    }
                }
                if (isPrime){
                    System.out.println(startingPointOfRange);
                    System.out.println(" Is a prime number");
                }
            }


    }
}

