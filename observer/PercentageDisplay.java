import java.util.ArrayList;
/*
 * Displays the percentage of votes each candidate has
 */
public class PercentageDisplay implements Observer{
    private Subject poll;
    private ArrayList<Candidate> candidates;
    /*
     * Constructor for the PercentageDisplay class
     * @param poll the subject to be observed
     */
    public PercentageDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }
    /*
     * Updates the percentage display
     * @param candidates the list of candidates
     */
    public void update(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
        display();
    }
    /*
     * Displays the percentage of votes each candidate has
     */
    private void display() {
        System.out.println("Current Percent of Votes:");
        double totalWeight = 0;
        for(Candidate c : candidates) {
            totalWeight += c.getWeightedVotes();
        }
        for(Candidate c: candidates) {
            System.out.println(c.getFullName() + " " + Math.floor((c.getWeightedVotes() / totalWeight)*10000) / 100 + "%");
        }
        System.out.println();
    }
}
