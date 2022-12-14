import java.util.ArrayList;
import java.util.Arrays;

public class Airport {

    static FlightTicket[] flights;

    static ArrayList<FlightTicket> flightTickets = new ArrayList<>();

    public static void main(String[] args) {

        FlightTicket flight1 = new FlightTicket("business", "Chicago","New Jersey");
        FlightTicket flight2 = new FlightTicket("economy", "Virgina","Chicago");
        FlightTicket flight3 = new FlightTicket("first", "Chicago","Chicago");
        FlightTicket flight4 = new FlightTicket("business", "Virgina","New York");
        FlightTicket flight5 = new FlightTicket("business", "Chicago","Virgina");
        FlightTicket flight6 = new FlightTicket("first", "Virgina","New York");
        FlightTicket flight7 = new FlightTicket("economy", "Chicago","Virgina");
        FlightTicket flight8 = new FlightTicket("first", "New York","New York");
        FlightTicket flight9 = new FlightTicket("economy", "Chicago","Nevşehir");
        FlightTicket flight10 = new FlightTicket("business", "New York","New York");

        flights = new FlightTicket[]{flight1, flight2, flight3, flight4, flight5, flight6, flight7, flight8, flight9, flight10};

        System.out.println(firsts().size());

        flightTickets.addAll(Arrays.asList(flight1, flight2, flight3, flight4, flight5, flight6, flight7, flight8, flight9, flight10));

        System.out.println(fromChicago().size());

    }

    public static ArrayList<FlightTicket> firsts(){
        ArrayList<FlightTicket> copy = new ArrayList<>(Arrays.asList(flights));
        copy.removeIf(p -> !p.getType().equals("first"));
        return copy;
    }

    public static ArrayList<FlightTicket> fromChicago(){
        ArrayList<FlightTicket> copy2 = new ArrayList<>(flightTickets);
        copy2.removeIf(p -> !p.getDepartureLocation().equalsIgnoreCase("Chicago"));
        return copy2;
    }

}
//Tasks:
//
//1- create a method returns list of flight tickets are first as type (try to make it dynamic)
//2- create a method returns list of flight tickets are from Chicago   (try to make it dynamic)