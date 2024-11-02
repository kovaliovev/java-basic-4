package org.example;

public class Main {

    public static void main(String[] args) {
        Text inputText = new Text("This is an example of text, entered by user, that needs processing.");

        int wordToRemoveLength = 4;

        Text result = StringHandler.removeWords(inputText, wordToRemoveLength);

        System.out.println("Original text: " + inputText);
        System.out.println("Formatted text: " + result);
    }
}