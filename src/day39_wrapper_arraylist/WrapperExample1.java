package day39_wrapper_arraylist;

public class WrapperExample1 {

    public static void main(String[] args) {

        int a = 5;
        // you cannot use method from it
        // You can: Print, assign / reassign, calculations, casting

        Integer i1 = new Integer(10);
        Integer i2 = 100;   // This converts int primitive to Integer wrapper class

        System.out.println(i1);
        System.out.println(i2);

        byte b = 4;
        Byte b2 = new Byte((byte)5);
        Byte b3 = (byte)500;
        System.out.println(b3);

        short s = 100;
        Short s2 = new Short((short)200);
        Short s3 = 300;

        long l = 1000L;
        Long l2 = new Long(2000L);
        Long l3 = 3000L;

        Float f1 = new Float(3.5F);
        Float f2 = 4.7f;


    }
}
