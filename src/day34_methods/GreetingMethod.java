package day34_methods;

import java.util.Scanner;

public class GreetingMethod {

    /*
        Method that will have the String parameter for the name
        Hello $name , how are you

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.nextLine();
        getName(name);
    }

//    public static void main(String[] args) {  // Manual way of doing it
//
//        getName("Vindar Tahir");
//    }

    public static void getName(String name){

        System.out.println("Hello " + name + ", how are you ?");
        System.out.println();

    }
}
