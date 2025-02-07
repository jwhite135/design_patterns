import java.util.ArrayList;
/*
 * The MusicBox class manages the state (language) of the songs played.  
 * @author Josiah White
 */
public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;
    /*
     * The constructor initializes the state attributes.
     */
    public MusicBox() {
        this.englishState = new EnglishState(this);
        this.frenchState = new FrenchState(this);
        this.spanishState = new SpanishState(this);
        this.state = englishState;
    }
    /*
     * Calls the function for the state to play Twinkle Twinkle Little Star
     */
    public void pressStarButton() {
        state.pressStarButton();
    }
    /*
     * Calls the function for the state to play that happy song
     */
    public void pressHappyButton() {
        state.pressHappyButton();
    }
    /*
     * Calls the function for the state to switch to English
     */
    public void pressEnglishButton() {
        state.pressEnglishButton();
    }
    /*
     * Calls the function for the state to switch to French
     */
    public void pressFrenchButton() {
        state.pressFrenchButton();
    }
    /*
     * Calls the function for the state to switch to Spanish
     */
    public void pressSpanishButton() {
        state.pressSpanishButton();
    }
    /*
     * Sets the state to the given state, allowing the MusicBox to change states (languages). 
     * @param state the state to change to.
     */
    public void setState(State state) {
        this.state = state;
    }
    /*
     * Returns the English State attribute. 
     * @return the English State attribute. 
     */
    public State getEnglishState() {
        return englishState;
    }
    /*
     * Returns the French State attribute.
     * @return the French State attribute.
     */
    public State getFrenchState() {
        return frenchState;
    }
    /*
     * Returns the Spanish State attribute.
     * @return the Spanish State attribute.
     */
    public State getSpanishState() {
        return spanishState;
    }
    /*
     * Plays the song with the given name and lyrics, utilizing the given LanguageSong class.
     * Makes sure to take time between printing the lyrics to allow the user to "sing," or at least read.  
     * @param songName the name of the song to play.
     * @param lyrics the lyrics of the song to play.
     */
    public void playSong(String songName, ArrayList<String> lyrics) {
        LanguageSongs ls = new LanguageSongs();
        ls.clear();
        for(String line : lyrics) {
            System.out.println(line);
            ls.sleep();
        }
    }
}