package day53_inheritance;

//public class Child extends FinalExamples{
//
//} Cannot extend FinalExamples class as it is final

public class Child extends Parent{

//    @Override
//    public static final void method(){
//
//    }

    // final method cannot be overridden

    public static final void method(int a){

    }

}

class Parent {

    public static final void method(){

    }

}