package day19_string;

public class EachCharacter {

    public static void main(String[] args) {

        String java = "java";
        //             0123

        // charAt(number) -> Gives char based on the number you give

        System.out.println(java.charAt(0));
        System.out.println(java.charAt(1));
        System.out.println(java.charAt(2));
        System.out.println(java.charAt(3));

        //System.out.println(java.charAt(100));

        // If you use an index number that does not exist in your String, it will go out of bounds

        char firstLetter = java.charAt(0);

        System.out.println(java.charAt(0) + java.charAt(1) + java.charAt(2) + java.charAt(3));
        // Above will add the ascii values of the char

        System.out.println("" + java.charAt(0) + java.charAt(1) + java.charAt(2) + java.charAt(3));
        // By adding the empty space, we can concatenate and get the character values, not addition, String + Char




    }
}
