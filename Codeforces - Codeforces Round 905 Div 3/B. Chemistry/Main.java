//  B. Chemistry

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
        for (String line : inputLines) {
            printSolution(line.trim());
        }
    }

    public static void printSolution(String input) {
        System.out.println(input);
    }

    /*
    conditions:
    1. all letters are lower case only
    2. remove exactly k characters.
    3. we can reorder the characters in any order to form a palindrome.

    objective: to remove exactly k characters from an input string and reorder the characters
    to form a palindrome.

    logic:
    1. 

    */
}
