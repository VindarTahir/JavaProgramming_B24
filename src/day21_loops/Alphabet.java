package day21_loops;

public class Alphabet {

    public static void main(String[] args) {
        /*
            Print the letters from a - z
         */

        char letter = 'a';

        while (letter <= 'z'){
            System.out.print(letter++ + " ");
            if (letter == 'k'){
                break;
            }
        }

        System.out.println();

        char letter2 = 'z';
        while (letter2 >= 'a'){
            System.out.print(letter2-- + " ");

        }
    }
}
