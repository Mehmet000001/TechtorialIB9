package Encapsulation;

public class City {
   private   String name;
   private long population;
   private int established;
   String language;
   public void setName(String name){
       this.name=name;

   }
   public void setPopulation(long population){
       this.population=population;

   }
   public void setEstablished(int established){
       this.established=established;
   }
   public String getName(){
       return name;
   }
   public  long getPopulation(){
       return  population;
   }
   public int getEstablished(){
       return established;
   }
}
