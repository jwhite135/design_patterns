import java.util.ArrayList;
/*
 * Airline class that holds a list of Flights.
 * @author Josiah White
 */
public class Airline {
    private String title;
    private ArrayList<Flight> flights;
    /*
     * The constructor for the Airline class.
     * @param title The title of the Airline.
     */
    public Airline(String title){
        this.title = title;
        flights = FlightLoader.getFlights();
    }
    /*
     * Returns the title of the Airline.
     * @return The title of the Airline.
     */
    public String getTitle() {
        return title;
    }
    /*
     * Creates a FlightIterator for the Airline.
     * @param fromCode The code of the Airport to start from.
     * @param toCode The code of the Airport to end at.
     * @return A FlightIterator for the Airline.
     */
    public FlightIterator createIterator(String fromCode, String toCode){
        return new FlightIterator(flights, Airport.valueOf(fromCode), Airport.valueOf(toCode));
    }
}