package my_utilities;

import day51_inheritance.Modifier;

public class TestModifierOutsidePackage {

    public static void main(String[] args) {

        Modifier obj = new Modifier();
        System.out.println(obj.A);
//        System.out.println(obj.B); Cannot be accesed because it is protected, and we are in different package
//        System.out.println(obj.C); cannot be accessed because it is default and we are in a different package


    }
}
