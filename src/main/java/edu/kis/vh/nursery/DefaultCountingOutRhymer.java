package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int ERROR = -1;
    public static final int DEFAULT = -1;
    public static final int FULL = 11;
    public static final int TAB_SIZE = FULL + 1;
    private final int[] numbers = new int[TAB_SIZE];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

}
