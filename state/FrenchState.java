/*
 * FrenchState inherits from State,  managing the songs and the state of the MusicBox in French.  
 * @author Josiah White
 */
public class FrenchState extends State {
    private static final String TWINKLE_FILE_NAME = "./songs/twinkle-french.txt";
    private static final String HAPPY_FILE_NAME = "./songs/happy-french.txt";
    /*
     * The constructor connects the MusicBox and the state.
     * @param box the MusicBox that the state belongs to.
     */
    public FrenchState(MusicBox box) {
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
     * Informs the user that they are already in French mode.
     */
    public void pressFrenchButton() {
        System.out.println("You are already in French Mode");
    }
    /*
     * Switches the box to Spanish.
     */
    public void pressSpanishButton() {
        System.out.println("Switching to Spanish");
        box.setState(box.getSpanishState());
    }
}