package day13_if_statements;

public class Weather {

    public static void main(String[] args) {

        /*
            sunny, rainy, windy, snowy, foggy, cloudy
         */

        String weather = "Snowy";
        String message = "";

        if (weather.equals("Sunny")){
            message = "Today is a sunny day, go outside you anime freak";
        }
        else if (weather.equals("Rainy")){
            message = "Stay home, drink some tea, code some java c:";
        }
        else if (weather.equals("Windy")){
            message = "Go fly a kite you inbred";
        }
        else if (weather.equals("Snowy")){
            message = "Go skiing, drink some hot cocoa, and code some fucken java";
        }
        else {
            message = "Not a valid weather type, still type java konoyaro";
        }
        System.out.println(message);
    }


}
