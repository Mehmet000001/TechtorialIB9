package InterviewQu;

public class FibonacciNumbers {
    public  static void fibonacciSeries(int nthFibonacciNumber){
        //every number in fibonacci series is sum of the previous two numbers
        //0 1 1 2 3 5 8 13
       int nextOne=0; //0 1 1 2 3 5
        //1 is sum of previous two numbers

       int secondOne =1;
       int temp=1;
       for ( int i=0;i<nthFibonacciNumber;i++){
           System.out.println(nextOne);
           nextOne=secondOne;
           secondOne=temp;
           temp=nextOne+secondOne;
       }

    }

    public static void main(String[] args) {
        fibonacciSeries(6);
    }
}
