package personal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AlbaJava {

    public static String sortStr(String str){
        String str2 = "";
        for(int i = 0; i < str.length(); i++) {
            str2 += ""+str.charAt(i);
            if(str.charAt(i)>='A' && i < str.length()-1 ) {
                if(str.charAt(i+1)<='9' ) {
                    str2 +=",";
                    System.out.println(str2);
                }
            }
            if(str.charAt(i)<='9' && i < str.length()-1) {
                if(str.charAt(i+1)>='A') {
                    str2 +=",";
                    System.out.println(str2);
                }
            }
        }
        System.out.println(str2);
        String[] arr = str2.split(",");
        str ="";
        for(String each: arr) {
            char[] chars=each.toCharArray();
            Arrays.sort(chars);
            for(char eachChar: chars){
                str +=""+eachChar;
            }
        }

        return str;

    }


    public static boolean validPassword(String password) {

        boolean lowercase = false;
        boolean uppercase = false;
        boolean special = false;
        boolean digit = false;
        boolean length=false;
        boolean space = false;

        if(password.length()>=6){
            length=true;
        }
        if(!password.contains(" ")){
            space=true;
        }
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                uppercase = true;
            } else if (Character.isLowerCase(password.charAt(i))) {
                lowercase = true;
            } else if (Character.isDigit(password.charAt(i))) {
                digit = true;
            } else {
                special = true;
            }

        }
        if (length&& uppercase && lowercase && digit && special&&space) {
            return true;
        }

        return false;
    }


    public static int sum(String str){

        int sum2 = 0;

        for (int i = 0; i < str.length(); i++) {

            sum2 += Integer.parseInt("" + str.charAt(i));

        }

        return sum2;

    }

    public static int sum(int a, int b){
        if (a+b > 1){
            return 0;
        }
        System.out.print(a+b);
        return a+b;
    }

    public static void main(String[] args) {

        System.out.println(sum(1, sum(0,1)));

    }


//    public static void main(String[] args) {
//
//        System.out.println(sortStr("DC501GCCCA098911"));
//
//        int [] arr = {3,6,2,7,4,10};
//
//        System.out.println(sum("1746"));
//
//        System.out.println(maxNum(arr));    // Gives 10
//
//        System.out.println(minNum(arr));    // Gives 2
//
//        System.out.println(sum(1, sum(0,1)));
//
//    }

    public static int maxNum(int [] arr){

        int max = arr[0];

        for (int i = 0; i < arr.length; i++){

            if (arr[i] > max){
                max = arr[i];
            }

        }

        return max;


    }


    public static int minNum(int [] arr){

        int min = arr[0];

        for (int i = 0; i < arr.length; i++){

            if (arr[i] < min){
                min = arr[i];
            }
        }

        return min;

    }

}
