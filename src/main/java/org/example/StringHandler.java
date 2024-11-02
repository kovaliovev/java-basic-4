package org.example;

public class StringHandler {

    public static Text removeWords(Text inputText, int lengthToRemove) {

        Text result = new Text("");

        for (Sentence sentence : inputText.getSentences()) {
            Sentence newSentence = new Sentence("");
            for (Object element : sentence.getElements()) {
                if (element instanceof Word) {
                    Word word = (Word) element;
                    if (word.length() == lengthToRemove && word.startsWithConsonant()) {
                        continue;
                    }
                }
                newSentence.getElements().add(element);
            }
            result.getSentences().add(newSentence);
        }
        return result;
    }
}