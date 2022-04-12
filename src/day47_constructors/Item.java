package day47_constructors;

import java.util.Scanner;

public class Item {

    String name;
    int quantity;
    double unitPrice;
    double total;

    public Item(String name, int quantity, double unitPrice){

        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        calculate();

    }

    public Item(String name){
        this.name = name;
    }

    public void calculate(){

        total = quantity * unitPrice;
    }

    public String toString(){
        return "\nItem: " + name + " | Quantity: " + quantity + " | Total Price: $" + total;
    }

}
