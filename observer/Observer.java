import java.util.ArrayList;
/*
 * Observer interface to manage and observe candidates.
 */
public interface Observer {
    public void update(ArrayList<Candidate> candidates);
}
