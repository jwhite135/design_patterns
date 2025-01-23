import java.util.ArrayList;
/*
 * A class that displays the current vote tallies for each candidate
 */
public class TallyDisplay implements Observer{
    private Subject poll;
    private ArrayList<Candidate> candidates;
    /*
     * Constructor for the TallyDisplay class
     * @param poll the subject to observe
     */
    public TallyDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }
    /*
     * Updates the current vote tallies for each candidate
     * @param candidates the list of candidates
     */
    public void update(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
        display();
    }
    /*
     * Displays the current vote tallies for each candidate
     */
    private void display() {
        System.out.println("Current Tallies:");
        for(Candidate c : candidates) {
            System.out.println(c.getFullName() + ": First(" + c.getNumFirstPlaceVotes() + "), Second(" + c.getNumSecondPlaceVotes() + "), Third(" + c.getNumThirdPlaceVotes() + ")");
        }
        System.out.println();
    }
}
