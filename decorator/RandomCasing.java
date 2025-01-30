import java.util.Random;
/*
 * This class modifies the password, changing the casing of the characters randomly.
 * @author Josiah White
 */
public class RandomCasing extends PasswordDecorator {
    /*
     * Constructor for the RandomCasing class  
     * @param passwordBeginning the password to be modified
     */
    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
    }
    /*
     * Returns the modified password
     * @return the modified password
     */
    public String getPassword() {
        StringBuilder str = new StringBuilder(passwordBeginning.getPassword());
        Random random = new Random();
        for(int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if(random.nextBoolean()) {
                str.setCharAt(i, Character.toUpperCase(c));
            }
            else {
                str.setCharAt(i, Character.toLowerCase(c));
            }
        }
        this.password = str.toString();
        return password;
    }

}