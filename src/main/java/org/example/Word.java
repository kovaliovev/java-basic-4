package org.example;

import java.util.ArrayList;
import java.util.List;

public class Word {
    private final List<Letter> letters = new ArrayList<>();

    public Word(String word) {
        for (char ch : word.toCharArray()) {
            letters.add(new Letter(ch));
        }
    }

    public int length() {
        return letters.size();
    }

    public boolean startsWithConsonant() {
        return !letters.isEmpty() && letters.getFirst().isConsonant();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Letter letter : letters) {
            result.append(letter);
        }
        return result.toString();
    }
}
