package day08_relational_logical_operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        double parkingFee = 7.50;

        System.out.println("You are an early bird, so half off");

       // parkingFee = parkingFee / 2; -> Manual way

        parkingFee /= 2;

        System.out.println("Your fee is: " + parkingFee);

        int tvs = 30;
     //   tvs--;
     //   tvs--;

        tvs -= 2; // tvs = 30 - 2;

        System.out.println(tvs);

        int i = 10;
        i %= 2; // i = i % 2 --> i = 10 % 2 --> i = 0

        System.out.println(i);







    }



}
