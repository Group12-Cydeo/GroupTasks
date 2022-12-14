import java.util.Scanner;

public class FlightTicket {

    // Fields
    private String type, departureLocation, arrivalLocation;

    Scanner scanner = new Scanner(System.in);

    public String getType() {
        return type;
    }
    public void setType(String type) {
        if(type.equalsIgnoreCase("first") || type.equalsIgnoreCase("business") || type.equalsIgnoreCase("economy")){
            this.type = type;
        }
    }

    public String getDepartureLocation() {
        return departureLocation;
    }
    public void setDepartureLocation(String departureLocation) {
        if(!departureLocation.isEmpty()){
            this.departureLocation = departureLocation;
        }
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }
    public void setArrivalLocation(String arrivalLocation) {
        if(!arrivalLocation.isEmpty()){
            this.arrivalLocation = arrivalLocation;
        }

    }

    public FlightTicket(String type, String departureLocation, String arrivalLocation) {
        setType(type);
        setArrivalLocation(arrivalLocation);
        setDepartureLocation(departureLocation);
    }

    public String toString() {
        return "Type: " + type + " | Departure Location: " + departureLocation + " | Arrival Location='" + arrivalLocation;
    }
}
/*FlightTicket Task

 declare these instance variables in FlightTicket class:
            type(first, business, economy
            departure location/airport
            arrival location/airport

         encapsulate all of them

         create constructor to set up the object

            Note: type should only be first, business, or economy

________________________________________


Then create 10 objects in Airport class in static block

Examples :

  FlightTicket ticket1 = new FlightTicket("first", "Chicago", "Virgina");
  FlightTicket ticket1 = new FlightTicket("business", "Chicago", "Virgina");
  .
  .
  .

Tasks:

1- create a method returns list of flight tickets are first as type (try to make it dynamic)
2- create a method returns list of flight tickets are from Chicago   (try to make it dynamic)
*/