package day48_static;

public class Iphone {

    String model;
    String color;
    double price;
    int storage;

    static String brand;
    static String os;

    public Iphone(String model, double price){
        this.model = model;
        this.price = price;
    }

    public Iphone(String model, String color, double price, int storage){

        this(model, price);
        this.color = color;
        this.storage = storage;

    }


    static {
        brand = "Apple";
        os = "IOS";
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}
