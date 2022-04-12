package dardan_questions;

public class WeekTwo {

    public static void finra(){

        String container = "";

        for (int i = 1; i <= 30; i++){

            if (i % 3 == 0 && i % 5 == 0){
                container += "FINRA ";
                continue;
            }

            if (i % 3 == 0){
                container += "FIN ";
                continue;
            }

            if (i % 5 == 0){
                container += "RA ";
                continue;
            }

            container += i + " ";

        }

        System.out.println(container);

    }

    public static String swap(int a, int b){

        System.out.println("A: " + a + ", B: " + b);

        // a = 5, b = 6

        a = a + b;  // a = 5 + 6: a = 11
        b = a - b;  // b = 11 - 6: b = 5
        a = a - b;  // a = 11 - 5: a = 6

        return "A: " + a + ", B: " + b;

    }

    public static void main(String[] args) {

        finra();
        System.out.println();
        System.out.println(swap(5,6));
        System.out.println();
        divisibleBy();

    }

    public static void divisibleBy(){

        System.out.println("Divisible by 15");

        for (int i = 1; i <= 100; i++){

            if (i % 15 == 0){
                System.out.print(i + ", ");
            }


        }

        System.out.println();

        System.out.println("Divisible by 3");

        for (int i = 1; i <= 100; i++){

            if (i % 3 == 0){
                System.out.print(i + ", ");
            }

        }

        System.out.println();

        System.out.println("Divisible by 5");

        for (int i = 1; i <= 100; i++){

            if (i % 5 == 0){
                System.out.print(i + ", ");
            }

        }



    }

}
