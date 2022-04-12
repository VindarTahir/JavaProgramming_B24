package day05_variables;

public class Cellphone {

    public static void main(String[] args) {
        /*
        ------------------------------------------------------------
Task

Add new a class CellPhone
Add main method

Create and assign there variables
    brand, model, color, price, storage, hasCamera

Print all the variables
------------------------------------------------------------

         */

        String brand = "Samsung";
        String model = "Note 9";
        String color = "Dark blue";
        double price = 499.99;
        String storage = "128gb";
        boolean hasCamera = true;

        String info = "This phone is a " + brand  + " " + model + " and has a " + color + " sheen to it. \n" +      "The price comes in at " + price + " and has " + storage + " of storage, and also has a camera which is ";

        color = "red"; // reassigned
        System.out.print("");
        System.out.println("Hello, and here is my phone for sale!");

        System.out.println("This phone is a " + brand  + " " + model + " and has a " + color + " sheen to it.");
        System.out.println("The price comes in at " + price + " and has " + storage + " of storage, and also has a camera which is " + hasCamera + "\n\n");



        System.out.println(info);




    }



}
