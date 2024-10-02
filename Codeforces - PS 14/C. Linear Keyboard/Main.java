//  C. Linear Keyboard

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
        int testCases = Integer.parseInt(inputLines.get(0));
        for (int i = 1; i < (testCases * 2); i = i + 2) {
            printSolution(inputLines.get(i), inputLines.get(i + 1));
        }
    }

    public static void printSolution(String keyBoardKeys, String wordToType) {
        char[] letters = wordToType.toCharArray();

        int timeTaken = 0;
        for (int i = 0; i < letters.length - 1; i++) {
            int start = keyBoardKeys.indexOf(letters[i]);
            int end = keyBoardKeys.indexOf(letters[i + 1]);
            timeTaken += Math.abs(start - end);
        }

        System.out.println(timeTaken);
    }

    /*
    conditions:
    1. the keyboard keys are NOT sorted and can have different positions, which means they have different values
    2. they are always 26 characters long
    3. keys are not repeating
    4. keys are numbered from left to right

    objective: to find the minimum time to type out a given string

    logic:
    1. iterate on the word to be typed to calculate the minimum time taken to type the string
    2. find the index value for the keys using the built-in indexOf(char ch) method in the keyBoardKeys string

    */
}
