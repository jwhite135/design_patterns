import java.util.ArrayList;
/**
 * Creates an object that holds an ArrayList of Appartment objects, with built-in sorting
 * @author josiah
 */
public class AppartmentList {
    private ArrayList<Appartment> appartments;
    private SortBehavior sortBehavior;
    
    public AppartmentList() {
        this.appartments = new ArrayList<Appartment>();
        this.sortBehavior = new BubbleSort();
    }
    /**
     * Adds a new Appartment to the list
     * @param address
     * @param numBedrooms
     * @param numBathrooms
     * @param price
     */
    public void add(String address, int numBedrooms, int numBathrooms, double price) {  
        appartments.add(new Appartment(address, numBedrooms, numBathrooms, price));
    }
    /**
     * Sets the sorting behavior for the list
     * @param sortBehavior
     */
    public void setSortBehavior(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
    }
    /**
     * Returns the Appartment list sorted
     * @return A sorted list of Appartments
     */
    public ArrayList<Appartment> getSortedList() {
        return sortBehavior.sort(appartments);
    }
    /**
     * Returns the Appartment list without sorting
     * @return An unsorted list of Appartments
     */
    public ArrayList<Appartment> getUnSortedList() {
        return appartments;
    }
}