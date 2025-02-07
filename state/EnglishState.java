/*
 * EnglishState inherits from State, managing the songs and the state of the MusicBox in English.  
 * @author Josiah White
 */
public class EnglishState extends State {
    private static final String TWINKLE_FILE_NAME = "./songs/twinkle-english.txt";
    private static final String HAPPY_FILE_NAME = "./songs/happy-english.txt";
    /*
     * The constructor connects the MusicBox and the state.
     * @param box the MusicBox that the state belongs to.
     */
    public EnglishState(MusicBox box) {
        super(box, TWINKLE_FILE_NAME, HAPPY_FILE_NAME);
    }
    /*
     * Informs the user that they are already in English mode.
     */
    public void pressEnglishButton() {
        System.out.println("You are already in English Mode");
    }
    /*
     * Switches the box to French.
     */
    public void pressFrenchButton() {
        System.out.println("Switching to French");
        box.setState(box.getFrenchState());
    }
    /* 
     * Switches the box to Spanish.
     */
    public void pressSpanishButton() {
        System.out.println("Switching to Spanish");
        box.setState(box.getSpanishState());
    }
}