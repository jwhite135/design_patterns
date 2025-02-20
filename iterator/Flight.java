import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
/*
 * Flight class that holds information about a flight
 * @author Josiah White
 */
public class Flight {
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;
    /*
     * Constructor for the Flight class
     * @param flightNum The flight number
     * @param from The airport the flight is leaving from
     * @param to The airport the flight is going to
     * @param startTime The time the flight is leaving
     * @param endTime The time the flight is arriving
     * @param numTransfers The number of transfers the flight has
     */
    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers){
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }
    /*
     * Getter for the flight number
     * @return The flight number
     */
    public Airport getFrom() {
        return from;
    }
    /*
     * Getter for the airport the flight is leaving from
     * @return The airport the flight is leaving from
     */
    public Airport getTo() {
        return to;
    }
    /*
     * Checks if the the given Airports for from and to are the same as the flight's from and to
     * @param from The airport the flight is leaving from
     * @param to The airport the flight is going to
     * @return If the given Airports are the same as the flight's from and to
     */
    public boolean sameLoc(Airport from, Airport to) {
        return this.from == from && this.to == to;
    }
    /*
     * String representation of the Flight
     * @return The string representation of the Flight
     */
    public String toString() {
        String end;
        if(numTransfers == 0) {
            end = "Direct Flight";
        } else if (numTransfers == 1) {
            end = "1 Stopover";
        } else {
            end = numTransfers + " Transfers";
        }
        return from + " to " + to + " " + startTime + " - " + endTime + " (" + (int)startTime.until(endTime, ChronoUnit.HOURS) + "h " + (int)(startTime.until(endTime, ChronoUnit.MINUTES) % 60) + "m) " + end;
    }
}