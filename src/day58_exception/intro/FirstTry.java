package day58_exception.intro;

public class FirstTry {

    public static void main(String[] args) {

        System.out.println("First line");

        try {
            String str = "java";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(100));

        } catch (StringIndexOutOfBoundsException e){
            System.out.println("We got exception");
        }

        System.out.println("Last line");


    }

}
