import java.util.ArrayList;
/**
 * BubbleSort class that implements the SortBehavior interface
 * @author josiah
 */
public class BubbleSort implements SortBehavior {
    /**
     * Sorts the list of Appartments using the BubbleSort algorithm
     * @param AppartmentList
     * @return A sorted list of Appartments
     */
    public ArrayList<Appartment> sort(ArrayList<Appartment> appartment) {
        for(int i = 0; i < appartment.size(); i++) {
            for(int j = 0; j < appartment.size() - 1; j++) {
                if(appartment.get(j).compareTo(appartment.get(j + 1)) > 0) {
                    Appartment temp = appartment.get(j);
                    appartment.set(j, appartment.get(j + 1));
                    appartment.set(j + 1, temp);
                }
            }
        }
        return appartment;
    }
}