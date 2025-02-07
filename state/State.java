import java.util.ArrayList;
/*
 * The abstract class state lays the outline for the various state children and also faciliates the songplaying.  
 * @author Josiah White
 */
public abstract class State {
    protected MusicBox box;
    private ArrayList<String> starLyrics;
    private ArrayList<String> happyLyrics;
    /*
     * The constructor takes in the music box, and reads the lyrics of the songs given the file name
     * @param box the MusicBox that the state belongs to.
     * @param twinkleFileName the file name of Twinkle Twinkle Little Star
     * @param happyFileName the file name of that happy song
     */
    public State(MusicBox box, String twinkleFileName, String happyFileName) {
        this.box = box;
        starLyrics = FileReader.getLyrics(twinkleFileName);
        happyLyrics = FileReader.getLyrics(happyFileName);
    }
    /*
     * Plays Twinkle Twinkle Little Star
     */
    public void pressStarButton() {
        box.playSong("Twinkle Twinkle Little Star", starLyrics);
    }
    /*
     * Plays that happy song
     */
    public void pressHappyButton() {
        box.playSong("If You're Happy and You Know It", happyLyrics);
    }
    /*
     * Switches the box to English, leaving the implementation to the children.  
     */
     public abstract void pressEnglishButton(); 
    /*
     * Switches the box to French, leaving the implementation to the children.
     */
     public abstract void pressFrenchButton();
    /*
     * Switches the box to Spanish, leaving the implementation to the children.
     */
    public abstract void pressSpanishButton();
}