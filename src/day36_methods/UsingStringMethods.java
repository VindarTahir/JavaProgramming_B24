package day36_methods;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import my_utilities.StringUtil;

import java.util.Scanner;

public class UsingStringMethods {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String s = "racecar";
        String reverse = StringUtil.reverse(s);

        System.out.println("Is palindrome?");
        System.out.println(s.equals(reverse));

        System.out.println("Enter a word");
        String word = input.nextLine();

        System.out.println(StringUtil.reverse(word));

        System.out.println("Enter your first name");
        System.out.println(StringUtil.properFormat(input.next()));

        System.out.println("Enter your last name");
        System.out.println(StringUtil.properFormat(input.next()));

    }
}
