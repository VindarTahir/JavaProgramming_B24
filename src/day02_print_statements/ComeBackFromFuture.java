package day02_print_statements;

import day49_encapsulation.AccessModifier;

public class ComeBackFromFuture {

    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        obj.a = 1;
    }
//        obj.b = 2; B is default, can only be accessed in same package
//        obj.c = 3; C is private, only accessed in same class

}

