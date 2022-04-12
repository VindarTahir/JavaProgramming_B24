package day05_variables;

public class CastingExamples {

    public static void main(String[] args) {

        long number = 90; // type is int, casts to long, automatically
        long number2 = 100L;

        short number3 = 10;
        float number4 = number3;

        // Bigger to smaller

        long num5 = 12;
        int num6 = (int)num5;  // Putting int in front of num 5 with () converts it to int from long manually
        System.out.println(num6);

        double num7 = 40.9999;
        int num8 = (int)num7; // Converting decimal to whole, rounds down and gives data loss
        System.out.println(num8);

        int num10 = 200;
        byte num11 = (byte)num10;

        System.out.println(num11);

        System.out.println((char)100);

        char letter = 'G';
        System.out.println((int)letter); // Converts char type to int type



    }




}
