package day45_custom_constructors;

public class Item {

    String name;
    double price;

    @Override
    public String toString() {      // Used generate method
        return "Item{" +
                "name: '" + name + '\'' +
                ", price: " + price +
                '}';
    }
}
