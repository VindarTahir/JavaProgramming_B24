package day56_polymorphism.transportation;

public class Car extends Transportation{

    @Override
    public void go() {
        System.out.println("CAR -- car is driving");
    }

    @Override
    public void stop() {
        System.out.println("CAR -- car is stopping");
    }

    public void openTrunk(){
        System.out.println("Opening the car trunk");
    }

    public void closeTrunk(){
        System.out.println("Closing the car trunk");
    }
}
