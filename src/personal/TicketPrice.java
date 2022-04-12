package personal;

public class TicketPrice {

    public static void main(String[] args) {

        /*
        -----------------------------------------------------------

add new class TicketPrice
add main method

From Chicago to Virginia
	city 1 -> Chicago
	city 2 -> Virginia
	base ticket price -> 110.50
	miles between cities -> 739.8
		add to the ticket price by dividing miles by 10

Example output:
	The ticket price from Chicago to Virginia is $184.48

----------------------------------------------------------
         */

        String city1 = "Chicago";
        String city2 = "Virginia";

        double baseTicketPrice = 110.50;
        double milesBetweenCities = 739.8;
        double ticketPrice = (milesBetweenCities / 10) + 110.50;

        System.out.println("The ticket price from " + city1 + " to " + city2 + " is $" + ticketPrice);

        float f = 40.2f;
        long l = 9L;

        float result = f * l;
        long result2 = (long)(f * l);

        System.out.println(result);
        System.out.println(result2);



    }



}
