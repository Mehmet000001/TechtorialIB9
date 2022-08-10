package ArrayList;

public class Computer {
    // make model price size
    String make;
    String model;
    double price;
    double size;
    public Computer(String make,String model,double price,double size){
        this.make=make;
        this.model=model;
        this.price=price;
        this.size=price;

    }//overwrite
    public String toString(){//coming from object take all info take the you create object it will show.if need get your object info.
        return "Make is: "+make+"Model is :"+model+"Price is :"+price+"Size is: "+size;
    }
}
