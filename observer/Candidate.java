/*
 * A class to represent a candidate in a student government election.
 */
public class Candidate {
    public static int totalNumVotes = 0;
    private String firstName;
    private String lastName;
    private int numFirstPlaceVotes = 0;
    private int numSecondPlaceVotes = 0;
    private int numThirdPlaceVotes = 0;
    /*
     * Creates a new candidate with the given first and last name.
     * @param firstName the candidate's first name
     * @param lastName the candidate's last name
     */
    public Candidate(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    /*
     * Compares this candidate to the given first and last name.
     * @param firstName the first name to compare
     * @param lastName the last name to compare
     */
    public boolean equals(String firstName, String lastName) {
        return (this.firstName.equals(firstName) && this.lastName.equals(lastName));
    }
    /*
     * Adds a vote to the total number of votes.
     */
    public static void addVote() {
        totalNumVotes++;
    }
    /*
     * Adds a first place vote to this candidate.
     */
    public void addFirstPlaceVote() {
        numFirstPlaceVotes++;
        addVote();
    }
    /*
     * Adds a second place vote to this candidate.
     */
    public void addSecondPlaceVote() {
        numSecondPlaceVotes++;
        addVote();
    }
    /*
     * Adds a third place vote to this candidate.
     */
    public void addThirdPlaceVote() {
        numThirdPlaceVotes++;
        addVote();
    }
    /*
     * Returns the weighted votes for this candidate.
     * @return a double with the weighted votes for this candidate
     */
    public double getWeightedVotes() {
        return (numFirstPlaceVotes * 0.6) + (numSecondPlaceVotes * 0.3) + (numThirdPlaceVotes * 0.1);
    }
    /*
     * Returns the full name of this candidate.
     * @return a String with the candidate's full name.
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }
    /*
     * Returns the number of first place votes for this candidate.
     * @return an int with the number of first place votes for this candidate.
     */
    public int getNumFirstPlaceVotes() {
        return numFirstPlaceVotes;
    }
    /*
     * Returns the number of second place votes for this candidate.
     * @return an int with the number of second place votes for this candidate.
     */
    public int getNumSecondPlaceVotes() {
        return numSecondPlaceVotes;
    }
    /*
     * Returns the number of third place votes for this candidate.
     * @return an int with the number of third place votes for this candidate.
     */
    public int getNumThirdPlaceVotes() {
        return numThirdPlaceVotes;
    }
}
