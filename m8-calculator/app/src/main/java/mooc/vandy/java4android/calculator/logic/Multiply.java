package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO - add your solution here.
    private int num1 = 0;
    private int num2 = 0;

    public Multiply(int One, int Two) {
        num1 = One;
        num2 = Two;
    }

    public String toString() {
        return String.valueOf(num1 * num2);
    }
}
