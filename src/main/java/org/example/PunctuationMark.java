package org.example;

public class PunctuationMark {
    private final char mark;

    public PunctuationMark(char mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return String.valueOf(mark);
    }
}
