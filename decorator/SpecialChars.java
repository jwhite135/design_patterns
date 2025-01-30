import java.util.Random;
/*
 * This class modifies the password, adding special characters randomly.
 */
public class SpecialChars extends PasswordDecorator {
    /*
     * Constructor for the SpecialChars class
     * @param passwordBeginning the password to be modified
     */
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }
    /*
     * Returns the modified password
     * @return the modified password
     */
    public String getPassword() {
        Random random = new Random();
        StringBuilder str = new StringBuilder(passwordBeginning.getPassword());
        char[] specialChars = {'*', '!', '%', '+', '.', '{', '}'};
        for(int i = 0; i < str.length(); i++) {
            if(random.nextInt(10) >= 7) {
                str.insert(i, specialChars[random.nextInt(specialChars.length)]);
            }
        }
        this.password = str.toString();
        return password;        
    }
}