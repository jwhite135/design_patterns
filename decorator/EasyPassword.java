import java.util.Random;
/*
 * This class modifies the password, replacing spaces with hyphens and appending a random number.
 */
public class EasyPassword extends Password {
    /*
     * Constructor for the EasyPassword class
     * @param phrase the password to be modified
     */
    public EasyPassword(String phrase) {
        this.password = phrase;
    }
    /*
     * Returns the modified password
     * @return the modified password
     */
    public String getPassword() {
        this.password = password.replace(' ', '-');
        Random random = new Random();
        this.password = password + random.nextInt(100);
        return password;
    }
}