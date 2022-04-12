package day56_polymorphism.shape;

public class Sphere extends Shape implements HasVolume {

    double radius;

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double volume() {
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }
}
