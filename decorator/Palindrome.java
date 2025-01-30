/*
 * This class modifies the password, adding the reverse of the password to the end of the password.
 */
public class Palindrome extends PasswordDecorator {
    /*
     * Constructor for the Palindrome class
     * @param passwordBeginning the password to be modified
     */
    public Palindrome(Password passwordBeginning) {
        super(passwordBeginning);
    }
    /*
     * Returns the modified password
     * @return the modified password
     */
    public String getPassword() {
        StringBuilder str = new StringBuilder(password);
        this.password = str.toString() + str.reverse().toString();
        return password;
    }
}