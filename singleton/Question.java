import java.util.Random;
/*
 * Question class is a simple class that represents a math question.
 * @author Josiah White
 */
public class Question {
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private int num1;
    private int num2;
    private int answer;
    private int userAnswer;
    private Operand operand;
    /*
     * Constructor for the Question class.  Empty since it doesn't need to do anything.  
     */
    public Question() {

    }
    /*
     * getQuestion returns a string with 2 random numbers and a random operand representing a math equation
     * @return a string with a math equation
     */
    public String getQuestion() {
        Random rand = new Random();
        num1 = rand.nextInt(100);
        num2 = rand.nextInt(100);
        operand = Operand.values()[rand.nextInt(Operand.values().length)];
        switch (operand) {
            case PLUS:
                answer = num1 + num2;
                return num1 + " + " + num2 + " = ";
            case MINUS:
                answer = num1 - num2;
                return num1 + " - " + num2 + " = ";
            case MULTIPLY:
                answer = num1 * num2;
                return num1 + " * " + num2 + " = ";
            default:
                return "";
        }
    }
    /*
     * setUserAnswer sets the user's answer to the question
     * @param answer the user's answer to the question
     */
    public void setUserAnswer(int answer) {
        userAnswer = answer;
    }
    /*
     * isCorrect checks if the user's answer is correct
     * @return true if the user's answer is correct, false otherwise
     */
    public boolean isCorrect() {
        return userAnswer == answer;
    }
    /*
     * toString returns a string representation of the question, with the accurate color for the correctness of the answer.  
     * @return a string representation of the question
     */
    public String toString() {
        if(isCorrect()) {
            return ANSI_GREEN + num1 + " " + operand.label + " " + num2 + " = " + answer + ANSI_BLACK;
        } else {
            return ANSI_RED + num1 + " " + operand.label + " " + num2 + " = " + answer + " You answered " + userAnswer + ANSI_BLACK;   
        }
    }
}