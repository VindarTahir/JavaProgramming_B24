package my_utilities;

import day51_inheritance.Modifier;
import personal.Test;

public class TestModifierWithInheritance extends Modifier {

    public static void main(String[] args) {

        Modifier obj = new Modifier();
        System.out.println(obj.A);
//      System.out.println(obj.B); Cannot be accesed because it is protected, and we are in different package
//      System.out.println(obj.C); cannot be accessed because it is default and we are in a different package

        TestModifierWithInheritance obj2 = new TestModifierWithInheritance();
        System.out.println(obj2.A);
        System.out.println(obj2.B);

    }
}
