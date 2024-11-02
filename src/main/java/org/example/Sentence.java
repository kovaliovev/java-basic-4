package org.example;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private final List<Object> elements = new ArrayList<>();

    public Sentence(String sentence) {
        String[] parts = sentence.split("(?=[\\p{Punct}])|(?<=\\p{Punct})|\\s+");
        for (String part : parts) {
            if (part.matches("\\p{Punct}")) {
                elements.add(new PunctuationMark(part.charAt(0)));
            } else {
                elements.add(new Word(part.trim()));
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
            if (element instanceof PunctuationMark) {
                result.append(element);
            } else {
                if (!result.isEmpty()) {
                    result.append(" ");
                }
                result.append(element);
            }
        }
        return result.toString();
    }
}
    