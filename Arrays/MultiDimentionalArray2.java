package Arrays;

import java.util.Arrays;

public class MultiDimentionalArray2 {
    public static void main(String[] args) {
//        Brands
//                Computers
//        Apple, Dell, HP, Lenova, Acer
//        TVs
//                Samsung, LG, Sony
//        Speakers
//                Alexa, Google, Siri, Logitec, JBL
//        -----------------------------
//                Prices
//        Computers
//        Apple-2500, Dell-1900, HP-1800, Lenova 1100, Acer-1600
//        TVs
//        Samsung-2199, LG-1699, Sony-1599
//        Speakers
//        Alexa-79.98, Google-89.45, Siri-99.98, Logitec-69.50, JBL-59.00
//        Task: Store brand in multidimentional array
//        Store prices in to multimentional array
//        print out prices for each product as:
//        "The price for Mac Pro 16 is $2500"
//        Collapse
///********* multidimenttional array inside array no limit.
        String [] [] brands={{"Apple","Dell","HP","Lenova","Acer"},{"Samsung","LG","Sony"},{"Alexa","Google","Siri","Logitec","JBL"}};
        double [][] prices={{2500,1900,1800,1100,1600},{2199,1699,1599},{79.98,89.45,99.98,69.50,59.00}};

       for (int i=0;i<brands.length;i++){
           for (int j=0;j<brands[i].length;j++) {

               if (prices[i][j] <= 1600) {///<1600 prices it will show you other way if not use before sout it will show all.
                   System.out.println("the price of" + brands[i][j] + "is $" + prices[i][j]);

               }

           }

       }




    }
}
