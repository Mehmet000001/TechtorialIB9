package HomeWork;

public class Task3HomeWork9 {
    public static void main(String[] args) {
            //num=153 num%10=3  num=num/10; 15%10=5


            int number = 153;
            int sum=0;
            int originalNum=number;
            while (number>0){
                int digit=number%10;///don't forget important
                number=number/10;/////don't forget important
                int cube=digit*digit*digit;
                sum+=cube;
                if (sum==originalNum){ ///
                    System.out.println(number+"is armstrong number");
                }
            }


        }
    }


