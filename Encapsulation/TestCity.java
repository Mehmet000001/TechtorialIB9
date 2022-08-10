package Encapsulation;

public class TestCity {
    public static void main(String[] args) {
        City city=new City();
        city.setEstablished(1980);
        System.out.println(city.getName());
        city.setName("Tokyo");
        System.out.println(city.getName());
        City city1=new City();
        System.out.println(city1.getName());
        city.language="Spanish";
    }
}
