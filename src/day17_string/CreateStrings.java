package day17_string;

public class CreateStrings {

    public static void main(String[] args) {

        String first = "Java"; // String literal
        // Creates a String object in the String pool

        String second = new String("Java"); // String using new
        // Creates a String object in the heap, NOT the String pool

        System.out.println(first == second); // == with String does not check the value
            // It checks the memory location and compares them

        System.out.println(first.equals(second)); // .equals compares the values, not memory location

        String third = "Java";

        System.out.println(first == third);

        String fourth = third;

        System.out.println(fourth);

        /*

    ======================================================
                        HEAP MEMORY
        ----------------------------------------------
                        STRING POOL

            first    ->     "Java"        <-  third

                               ^
                               fourth

            five     ->        "java" lower case j

        -----------------------------------------------
                    NEW STRING POOL
            second   ->     [    "Java"    ]

        ------------------------------------------------

    =========================================================
         */

        String five = "java";

        five = five + " is fun";

        String six = "Java is fun";

        System.out.println(five == six);
    }
}
