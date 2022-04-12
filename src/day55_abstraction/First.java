package day55_abstraction;

public interface First {

     public abstract void write(); // public abstract is grey because we do not need it, all methods are abstract by default

     void read();

}

class Book implements First{

    @Override
    public void write() {
        System.out.println("Writing the book");
    }

    @Override
    public void read() {
        System.out.println("Reading the book");
    }
}
