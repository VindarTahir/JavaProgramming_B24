package day09_scanner_logical;

public class ShortCircuit {

    public static void main(String[] args) {

        System.out.println(true && true);
        System.out.println(false && true);

      //  System.out.println(true && 5/0 == 0); problem

        System.out.println(false && 5/0 == 0); // Right side does not get executed
        //System.out.println(false & 5/0 == 0); // will always execute other side regardless of outcome

        System.out.println(true || false);

        System.out.println(true || 5/0 == 0);
        //System.out.println(true | 5/0 == 0); // will always execute other side regardless of outcome

        int count = 5;

        System.out.println(count++ == 5 || ++count == 7);
        System.out.println(count);

        int count2 = 5;

        System.out.println(count2++ == 5 | ++count2 == 7);
        System.out.println(count2);


    }


}
