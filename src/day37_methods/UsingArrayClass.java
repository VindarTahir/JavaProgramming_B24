package day37_methods;

import my_utilities.ArraysUtil;

public class UsingArrayClass {

    public static void main(String[] args) {

        int [] a = {4,5,15,159,19,234};

        System.out.println(ArraysUtil.maxNum(a));
        System.out.println(ArraysUtil.minNum(a));


        System.out.println(ArraysUtil.contains(a, 5));

    }

}
