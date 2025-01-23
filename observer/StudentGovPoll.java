import java.util.ArrayList;
/*
 * StudentGovPoll is a Subject that holds a list of Candidates and notifies Observers when votes are entered.
 */
public class StudentGovPoll implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Candidate> candidates;
    private String school;
    
    /*
     * The construct for the StudentGovPoll class.
     * @param school The name of the school that the StudentGovPoll is for.
     */
    public StudentGovPoll(String school) {
        this.school = school;
        this.observers = new ArrayList<Observer>();
        this.candidates = new ArrayList<Candidate>();
    }
    /*
     * Registers an Observer to the StudentGovPoll.
     * @param observer The Observer to be registered.
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    /*
     * Removes an Observer from the StudentGovPoll.
     * @param observer The Observer to be removed.
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    /*
     * Notifies all Observers of the StudentGovPoll.
     */
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(candidates);
        }
    }
    /*
     * Adds a Candidate to the StudentGovPoll.
     * @param firstName The first name of the Candidate.
     * @param lastName The last name of the Candidate.
     */
    public void addCandidate(String firstName, String lastName) {
        candidates.add(new Candidate(firstName, lastName));
    }
    /*
     * Enters votes for the StudentGovPoll.
     * @param firstPlace The number of the Candidate that is in first place.
     * @param secondPlace The number of the Candidate that is in second place.
     * @param thirdPlace The number of the Candidate that is in third place.
     */
    public void enterVotes(int firstPlace, int secondPlace, int thirdPlace) {
        candidates.get(firstPlace - 1).addFirstPlaceVote();
        candidates.get(secondPlace - 1).addSecondPlaceVote();
        candidates.get(thirdPlace - 1).addThirdPlaceVote();
        notifyObservers();
    }
    /*
     * Returns the name of the school.
     * @return A string with the name of the school.
     */
    public String getSchool() {
        return school;
    }
}
