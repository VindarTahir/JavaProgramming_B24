package day26_recap;

import java.util.Scanner;

public class HtmlGenerator {

    /*
        HTML Generator [String, Loops]

Given a String in the following format take the number part of the generator the html tags

	Ex:
		Input:
			div^2
		Output:
			<div></div><div></div>

	Ex:
		Input:
			li^3
		Output:
			<li></li><li></li><li></li>

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What html tag do you want to generate");
        String s = input.next(); // li^3

        String tag = s.substring(0, s.indexOf("^"));

        int indexOfCarrot = s.indexOf("^");
        String sNum = s.substring(indexOfCarrot + 1);

        // this code will turn a number in String format to a number type
        int num = Integer.parseInt(sNum);

        String html = "";

        for (int i = 0; i < num; i++){
            html += "<" + tag + ">" + "</" + tag + ">";
        }

        System.out.println(html);
    }
}
