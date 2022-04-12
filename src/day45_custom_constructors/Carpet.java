package day45_custom_constructors;

public class Carpet {

    /*
        info:
            width, length, unit price, if its persian, total price

            constructor:
                initialize the variables

                calculate the total price:
                    w * l * up

                    if persian add $200

            toString method to print the total price
     */

    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    double totalPrice;

    public Carpet(double inputWidth, double inputLength, double inputUnitPrice, boolean inputIsPersian){

        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnitPrice;
        isPersian = inputIsPersian;
        totalPrice = (width * length * unitPrice);

        if (isPersian){
            totalPrice += 200;
        }

    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width: " + width +
                ", length: " + length +
                ", unitPrice: " + unitPrice +
                ", isPersian: " + isPersian  +
                ", totalPrice: " + totalPrice +
                '}';
    }
}
