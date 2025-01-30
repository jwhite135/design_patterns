/*
 * This class replaces certain characcters with symbols to the password.  
 * @author Josiah White
 */
public class Symbols extends PasswordDecorator {
    /*
     * Constructor for the Symbols class
     * @param passwordBeginning the password to be modified
     */
    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
    }
    /*
     * Returns the modified password
     * @return the modified password
     */
    public String getPassword() {
        this.password = password.replace('a', '@');
        this.password = password.replace('b', '8');
        this.password = password.replace('e', '3');
        this.password = password.replace('g', '9');
        this.password = password.replace('i', '!');
        this.password = password.replace('o', '0');
        this.password = password.replace('s', '$');
        this.password = password.replace('t', '7');
        return password;
    }
}