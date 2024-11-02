package org.example;

public class Letter {
    private final char character;

    public Letter(char character) {
        this.character = character;
    }

    public boolean isConsonant() {
        return "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz".indexOf(character) != -1;
    }

    @Override
    public String toString() {
        return String.valueOf(character);
    }
}