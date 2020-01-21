package edu.kis.vh.nursery.listAndStack;

public class IntArrayStack implements ListStackInterface {
    private static final int SIZE = 12;
    private static final int RETURN_NUMBER = 0;
    private final int[] NUMBERS = new int[SIZE];
    private int total = RETURN_NUMBER;

    @Override
    public void push(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == RETURN_NUMBER;
    }
    @Override
    public boolean isFull() {
        return total == 11;
    }

    @Override
    public int top() {
        if (isEmpty())
            return RETURN_NUMBER;
        return NUMBERS[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return RETURN_NUMBER;
        return NUMBERS[total--];
    }
}