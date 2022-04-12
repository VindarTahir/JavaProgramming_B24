package day51_inheritance;

public class Library {
    public static void main(String[] args) {

        Book bookOne = new Book();

        bookOne.title = "James Bond";
        // bookOne reference has access to 6 instance vars which were made in the Book class

        EBook bookTwo = new EBook();
        bookTwo.size = 50;
        bookTwo.title = "MindSet";
        // bookTwo reference has access to 8 instance vars. 6 from the Book class and 2 from EBook class
        bookTwo.read();

        AudioBook bookThree = new AudioBook();
        bookThree.title = "'The Journey of Vindar Tahir'";
        bookThree.duration = 50;
        bookThree.narrator = "'Beyav Muhsen'";

        bookThree.listen();

    }
}
