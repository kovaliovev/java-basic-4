package org.example;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private final List<Sentence> sentences = new ArrayList<>();

    public Text(String text) {
        parseText(text);
    }

    private void parseText(String text) {
        String cleanedText = text.replaceAll("[\\t\\s]+", " ");
        String[] sentenceParts = cleanedText.split("(?<=[.!?])\\s+");

        for (String part : sentenceParts) {
            sentences.add(new Sentence(part));
        }
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Sentence sentence : sentences) {
            result.append(sentence).append(" ");
        }
        return result.toString().trim();
    }
}
