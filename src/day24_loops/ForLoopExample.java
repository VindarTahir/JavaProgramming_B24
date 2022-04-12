package day24_loops;

public class ForLoopExample {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){

            System.out.println(i);

        }

        /*
            Flow of for loop:

               - it executed the initialization part to delcare the variable
                int i = 1;

                    -> once in the beginnning of the loop

               - Checks the boolean / termination condition part
                   i <= 10

                   if boolean is true, loop will run, else stops

                   - next the loop body, statements inside of the loop

                        System.out.println(i);

                   - next the update part is run
                      i++

                  - repeat the steps by checking the boolean / termination condition part
                       i <= 10
         */
    }
}
