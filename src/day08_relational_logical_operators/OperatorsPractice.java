package day08_relational_logical_operators;

import java.sql.SQLOutput;

public class OperatorsPractice {

    public static void main(String[] args) {

        int c = 1;  // c = 1
        int d = -c-- + c++ / -c-- * --c;
        //      -1   + 1   / -1   *  0
        //      -1   + -1  * 0
        //      -1 = d

        System.out.println(d);
        System.out.println(c);

        int t = 100;    // t = 100 | 101 | 100 | 101 | 100
        int p = - ++t * -t-- / t++ + --t;
        //      - 101 * -101 / 100 + 100
        //       10,201      /  100 + 100
        //        102  + 100
        //    p =      202
        System.out.println(t);
        System.out.println(p);

        int R = 20; // r = 20 | 19 | 20 | 19 | 18
        int W = -R-- + -R++ + --R * R-- % 2;
        //      -20  + -19  + 19  * 19  % 2
        //      -20  + -19  + 361 % 2 -> 361 / 2  360 -> 180  * 2 = 360 | 361 - 360 = 1
        //      -20 - 19 + 1
        //      -39 + 1
        //      -38





    }


}
