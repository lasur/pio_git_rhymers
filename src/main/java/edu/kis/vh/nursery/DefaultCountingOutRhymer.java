package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {


    public static final int SIZE = 12;
    private static final int RETURN_NUMBER = -1;
    private final int[] NUMBERS = new int[SIZE];

    public int total = RETURN_NUMBER;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == RETURN_NUMBER;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN_NUMBER;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN_NUMBER;
        return NUMBERS[total--];
    }

}
