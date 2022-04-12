package day46_constructors;

public class ThisKeyword {

    int a = 100;    // instance var

    public ThisKeyword(int b){  // a is the local variable

        b = 400;   // reassign local a to be 400

    }

    public static void main(String[] args) {

        ThisKeyword obj = new ThisKeyword(200);
        System.out.println(obj.a);



    }
}
