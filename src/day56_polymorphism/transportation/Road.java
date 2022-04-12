package day56_polymorphism.transportation;

public class Road {

    public static void main(String[] args) {

        Transportation obj1 = new Transportation();

        obj1.go();
        obj1.stop();

        // Car objects
        System.out.println();

        Car obj2 = new Car();

        obj2.go();
        obj2.stop();
        obj2.closeTrunk();

        System.out.println();

        // Tesla objects
        Tesla obj3 = new Tesla();

        obj3.closeTrunk();
        obj3.charging();
        obj3.selfDrive();
        obj3.stop();


    }

}
