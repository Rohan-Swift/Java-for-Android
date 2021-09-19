package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    // TODO - add your solution here.
    private int num1 = 0;
    private int num2 = 0;

    public Subtract(int One, int Two) {
        num1 = One;
        num2 = Two;
    }

    public String toString() {
        return String.valueOf(num1 - num2);
    }
}

