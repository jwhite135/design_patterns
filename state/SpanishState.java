/*
 * SpanishState inherits from State, managing the songs and the state of the MusicBox in Spanish.
 * @author Josiah White
 */
public class SpanishState extends State {
    private static final String TWINKLE_FILE_NAME = "./songs/twinkle-spanish.txt";
    private static final String HAPPY_FILE_NAME = "./songs/happy-spanish.txt";
    /*
     * The constructor connects the MusicBox and the state.
     * @param box the MusicBox that the state belongs to.
     */
    public SpanishState(MusicBox box) {
        super(box, TWINKLE_FILE_NAME, HAPPY_FILE_NAME);
    }
    /*
     * Switches the box to English.  
     */
    public void pressEnglishButton() {
        System.out.println("Switching to English");
        box.setState(box.getEnglishState());
    }
    /* 
     * Switches the box to French.  
     */
    public void pressFrenchButton() {
        System.out.println("Switching to French");
        box.setState(box.getFrenchState());
    }
    /*
     * Informs the user that they are already in Spanish mode.
     */
    public void pressSpanishButton() {
        System.out.println("You are already in Spanish Mode");
    }
}