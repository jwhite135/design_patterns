import java.util.ArrayList;
/**
 * QuickSort class that implements the SortBehavior interface
 * @author josiah
 */
public class QuickSort implements SortBehavior {
    /**
     * Sorts the list of Appartments using the QuickSort algorithm
     * @param AppartmentList
     * @return A sorted list of Appartments
     */
    public ArrayList<Appartment> sort(ArrayList<Appartment> appartments) {
        return quickSort(appartments);
    }
    /**
     * Private helper method to execute QuickSort
     * @param AppartmentList
     * @return A sorted list of Appartments
     */
    private ArrayList<Appartment> quickSort(ArrayList<Appartment> apt) {
        if(apt.size() <= 1) {
            return apt;
        }

        int middle = (int) Math.ceil((double)apt.size() / 2);
        Appartment pivot = apt.get(middle);

        ArrayList<Appartment> less = new ArrayList<Appartment>();
        ArrayList<Appartment> greater = new ArrayList<Appartment>();

        for(int i = 0; i < apt.size(); i++) {
            if(apt.get(i).compareTo(pivot) == 0) {}
            else if(apt.get(i).compareTo(pivot) == 1) {
                less.add(apt.get(i));
            }
            else {
                greater.add(apt.get(i));
            }
        }

        return concatenate(quickSort(less), pivot, quickSort(greater));
    }
    /**
     * Private helper method to put the ArrayLists back together when sorted
     * @param less
     * @param pivot
     * @param greater
     * @return The 3 ArrayLists put together
     */
    private ArrayList<Appartment> concatenate(ArrayList<Appartment> less, Appartment pivot, ArrayList<Appartment> greater) {
        ArrayList<Appartment> sorted = new ArrayList<Appartment>(less);
        sorted.add(pivot);
        sorted.addAll(greater);
        return sorted;
    }
}