package day46_constructors;

public class MyOffer {

    public static void main(String[] args) {

        Offer first = new Offer("Chase", 150_000, true);
        System.out.println(first);
        System.out.println();
        Offer second = new Offer("Chicago", "Cybertek", 155_000, false, 50);
        System.out.println(second);
    }
}
