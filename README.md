# String Handler

This is a Java application that processes a given text by breaking it down into classes for letters, words, sentences, punctuation marks, and the text itself. It removes all words of a specified length that begin with a consonant and replaces sequences of tabs and spaces with a single space.

## Project Structure

- `Main.java`: Entry point of the program.
- `StringHandler.java`: Class that contains the method for processing the text by removing words with the specified conditions.
- `Text.java`: Class representing the entire text, composed of multiple sentences.
- `Sentence.java`: Class representing a sentence, composed of words and punctuation marks.
- `Word.java`: Class representing a word, composed of letters.
- `Letter.java`: Class representing an individual letter.
- `PunctuationMark.java`: Class representing a punctuation mark.

## How to Run

### Prerequisites
1. Install the [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) version 8 or above.
2. Install [Maven](https://maven.apache.org/) or use a Java-compatible IDE like [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/ide/).

### Clone the repository
```bash
git clone https://github.com/kovaliovev/java-basic-4.git
```

### Navigate to the root directory of the project
```bash
cd java-basic-4
```

### Compile the project
```bash
javac -d out -sourcepath src src/main/java/org/example/*.java
```

### Run the project
```bash
java -cp out org.example.Main
```
