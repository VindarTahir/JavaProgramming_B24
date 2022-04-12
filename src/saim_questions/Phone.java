package saim_questions;

public abstract class Phone {

    String brand;
    String model;
    double price;
    int size;

    public abstract void calling();
    public abstract void texting();

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
