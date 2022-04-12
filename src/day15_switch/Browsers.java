package day15_switch;

import java.util.Scanner;

public class Browsers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Which browser do you want to use?");

        String browser = input.next();
        System.out.println("Enter the url: ");
        String url = input.next();

        switch (browser){

            case "Chrome":
                System.out.println("Opening " + url + " in Chrome");
                break;

            case "Firefox":
                System.out.println("Opening " + url + " in Firefox");
                break;

            case "Safari":
                System.out.println("Your mac is opening up Safari");
                System.out.println("Going to " + url);
                break;

            case "Ie":
                System.out.println("IE is no longer supported");
                break;

            case "Edge":
                System.out.println("Edge is opening " + url);
                break;

            default:
                System.out.println("Browser is not supported :(");



        }

    }
}
