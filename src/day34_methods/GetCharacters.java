package day34_methods;

public class GetCharacters {

    /*
        Make a method that will print all the letters from A to Z
        Make a method that will print all the letters from a to z
        Make a method that will print all the letters from Z to A
        Make a method that will print all the letters from z to a
        Make a method that will print all the letters from 0 to 9

     */

    public static void capitalAtoZ(){
        char letter = 'A';

        while (letter <= 'Z'){
            System.out.print(letter++ + " ");
        }
        System.out.println();
    }

    public static void lowercaseAtoZ(){
        char letter = 'a';

        while (letter <= 'z'){
            System.out.print(letter++ + " ");
        }
        System.out.println();
    }

    public static void capitalZtoA(){
        char letter = 'Z';

        while (letter >= 'A'){
            System.out.print(letter-- + " ");
        }
        System.out.println();
    }

    public static void lowercaseZtoA(){
        char letter = 'z';

        while (letter >= 'a'){
            System.out.print(letter-- + " ");
        }
        System.out.println();
    }

    public static void numbers0Thru9(){
        for (int i = 0; i <= 9; i++){
            System.out.print((i) + " ");
        }
        System.out.println();
    }

}

