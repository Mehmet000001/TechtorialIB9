package ArrayList;

import java.util.ArrayList;

public class FlowerTest {
    public static void main(String[] args) {
        Flower flower1 = new Flower("Rose", "red", "small", 100);
        Flower flower2 = new Flower("Lily", "red", "meduim", 100);
        Flower flower3 = new Flower("Orchid", "red", "large", 100);
        Flower flower4 = new Flower("Carnation", "red", "small", 100);
        Flower flower5 = new Flower("Hyacinth", "red", "meduim", 100);
        ArrayList <Flower>flowersN=new ArrayList();
        flowersN.add(flower1);
        flowersN.add(flower2);
        flowersN.add(flower3);
        flowersN.add(flower4);
        flowersN.add(flower5);
      double sum=Flower.getSumFlowersPrice(flowersN);
        System.out.println(sum);
    }
}
