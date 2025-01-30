/*
 * An abstract class to assist with modifying the password
 * @author Josiah White
 */
abstract class PasswordDecorator extends Password {
    protected Password passwordBeginning;
    /*
     * Constructor for the PasswordDecorator class
     * @param passwordBeginning the password to be modified
     */
    public PasswordDecorator(Password passwordBeginning) {
        this.passwordBeginning = passwordBeginning;
        this.password = passwordBeginning.password;
    }
    /*
     * Returns the password
     * @return the password
     */
    public String getPassword() {
        return password;
    }
}