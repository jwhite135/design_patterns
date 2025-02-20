import java.util.ArrayList;
import java.util.Iterator;
/*
 * FlightIterator class implements Iterator interface and provides the implementation for hasNext() and next() methods.
 * @author Josiah White
 */
public class FlightIterator implements Iterator<Flight> {
    private ArrayList<Flight> flights;
    private int positions;
    private Airport from;
    private Airport to;
    /*
     * Constructor for FlightIterator class
     * @param flights ArrayList of Flight objects
     * @param from Airport object
     * @param to Airport object
     */
    public FlightIterator(ArrayList<Flight> flights, Airport from,  Airport to) {
        this.flights = flights;
        this.from = from;
        this.to = to;
        this.positions = 0;
    }
    /*
     * Checks if the position exceeds the elements in the ArrayList and if another matching flight exists in the flight list
     * @return boolean value
     */
    public boolean hasNext() {
        while(positions < flights.size() && !flights.get(positions).sameLoc(from, to)) {
            positions++;
        }
        return positions < flights.size();
    }
    /*
     * Returns the next Flight object in the ArrayList
     * @return Flight object
     */
    public Flight next() {
        return flights.get(positions++);
    }
}