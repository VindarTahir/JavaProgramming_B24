package day23_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        /*
           Continue to store items to a shopping list

         */
        Scanner input = new Scanner(System.in);

        String shopList = "";
        String addMore;

        do{
            System.out.println("What do you want to add to the list");
            shopList += input.nextLine() + ", ";

            System.out.println("Do you want to add more items? y or n");
            addMore = input.nextLine();

        }while (addMore.equalsIgnoreCase("y") || addMore.equalsIgnoreCase("yes"));

        System.out.println(shopList.substring(0, shopList.length() - 2));
    }
}
