package day36_methods;

public class VoidVsReturn {

    // this is  void method with no params
    public static void main(String[] args) {
        sayHello();
//        String s = sayHello();
//        System.out.println(sayHello(););

        String bye = sayBye();

//      System.out.println(sayBye());
        System.out.println(bye);


        String s = "Java";
        char c = s.charAt(0);
        int i = s.length();
        char [] arr = s.toCharArray();
        String sub = s.substring(0, 1);

    }
    public static void sayHello(){
        System.out.println("Hello World");
    }

    public static String sayBye(){
        return "Bye World";
    }
}
