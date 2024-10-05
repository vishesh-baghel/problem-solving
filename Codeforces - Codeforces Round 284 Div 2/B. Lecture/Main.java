//  B. Lecture

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    static List<String> readAllLines() throws IOException {
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = input.readLine()) != null && !line.trim().isEmpty()) {
            lines.add(line);
        }
        return lines;
    }

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        List<String> inputLines = Main.readAllLines();

        solution(inputLines);

    }

    public static void solution(List<String> inputLines) {
        String[] inputs = inputLines.get(0).split(" ");
        int numberOfWords = Integer.parseInt(inputs[1]);

        Map<String, String> wordMappings = new HashMap<>();
        for (int i = 1; i < numberOfWords + 1; i++) {
            String[] words = inputLines.get(i).split(" ");
            String first = words[0];
            String second = words[1];

            wordMappings.put(first, second);
            wordMappings.put(second, first);
        }

        String lectureContent = inputLines.get(inputLines.size() - 1);
        String[] lectureWords = lectureContent.split(" ");
        StringBuilder notesContent = new StringBuilder();

        for (int i = 0; i < lectureWords.length; i++) {
            String word = lectureWords[i];
            String anotherWord = wordMappings.get(word);

            if (word.length() <= anotherWord.length()) {
                notesContent.append(word + " ");
            } else {
                notesContent.append(anotherWord + " ");
            }
        }

        System.out.println(notesContent.toString().trim());
    }

    /*
    conditions:
    1. each word in both the languages corresponds to a single word, meaning there are no words that have two different meanings.
    2. output can have words from both the languages, if the length of the word is equal then first language is preffered.

    objective: to take the notes having words which are the shortest to write.

    logic:
    1. build a map to store the corresponding words
    2. In the lecture string, find the value in the map for the given word(key) and compare the lengths of both the strings
    3. Write the word which is having shorter length in the notes string.

    */
}
