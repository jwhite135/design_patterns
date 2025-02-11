import java.util.ArrayList;
import java.util.Iterator;
/*
 * MathGame is a singleton class that generates a list of questions
 * @author Josiah White
 */
public class MathGame {
    private static final int NUM_QUESTIONS = 5;
    private static MathGame mathGame;
    private ArrayList<Question> questions;
    /*
     * Constructor.  Private to prevent instantiation, and empty since it has nothing it needs to do.  
     */
    private MathGame() {

    }
    /*
     * Returns the instance of MathGame.  If it doesn't exist, it creates it along with the questions.  
     * @return mathGame the instance of MathGame
     */
    public static MathGame getInstance() {
        if (mathGame == null) {
            mathGame = new MathGame();
            mathGame.questions = new ArrayList<Question>();
            for (int i = 0; i < NUM_QUESTIONS; i++) {
                mathGame.questions.add(new Question());
            }
        }
        return mathGame;
    }
    /*
     * Returns an iterator for the questions.
     * @return Iterator<Question> the iterator for the questions
     */
    public Iterator<Question> getIterator() {
        return questions.iterator();
    }
}