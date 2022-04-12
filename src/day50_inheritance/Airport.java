package day50_inheritance;

public class Airport {

    public static void main(String[] args) {

        FlightTicket ticket = new FlightTicket("first", "KJFK", "KLAX");

        System.out.println(ticket.getArivLocation());
        System.out.println(ticket.getDepLocation());
        ticket.setArivLocation("New Drizzy Baby");
        System.out.println(ticket.getArivLocation());

    }
}
