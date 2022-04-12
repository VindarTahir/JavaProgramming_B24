package day56_polymorphism.transportation;

public class Tesla extends Car implements SelfDriveable, Electric{
    @Override
    public void go() {
        System.out.println("Tesla is going");
    }

    @Override
    public void charging() {
        System.out.println("Tesla is charging");
    }

    @Override
    public void stop() {
        System.out.println("Tesla is stopping");
    }

    @Override
    public void openTrunk() {
        System.out.println("Tesla is opening trunk");
    }

    @Override
    public void closeTrunk() {
        System.out.println("Tesla is closing trunk");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla is self-driving");
    }
}
