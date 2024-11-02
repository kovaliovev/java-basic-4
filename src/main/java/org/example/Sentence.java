package org.example;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private final List<Object> elements = new ArrayList<>();

    public Sentence(String sentence) {
        String[] words = sentence.split("\\s+");
        for (String part : words) {
            if (part.matches("\\p{Punct}")) {
                elements.add(new PunctuationMark(part.charAt(0)));
            } else {
                elements.add(new Word(part));
            }
        }
    }

    public List<Object> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Object element : elements) {
            result.append(element).append(" ");
        }
        return result.toString().trim();
    }
}
    