package day49_encapsulation;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public void calculate(){
        System.out.println(length * width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if (length > 0){
            this.length = length;
        } else {
            System.out.println("Error, number must be greater than 0");
        }
    }

    public void setWidth(double width){
        if (width > 0){
            this.width = width;
        } else {
            System.out.println("Error, number must be greater than 0");
        }
    }


}
