package personal;

import java.util.Scanner;

public class Planets {

        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);

            System.out.println("what is the farthest planet in the solar system:" );
            System.out.println("a)venus" );
            System.out.println("b)pluto" );
            System.out.println("c)neptune" );

            String a = s.nextLine();
            a = s.nextLine();
            //your code here

            if (a.equals("a)venus")){

                System.out.println("a is wrong");

            }
            else if (a.equals("b)pluto")){

                System.out.println("b is correct");

            }
            else if (a.equals("c)neptune")); {

                System.out.println("c is wrong");

            }
            if (a.equals("z")) {

                System.out.println("z is not a valid answer");

            }




        }
    }

