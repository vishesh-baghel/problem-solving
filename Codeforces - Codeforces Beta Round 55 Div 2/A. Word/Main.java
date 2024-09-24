//  A. Word

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
        char[] letters = input.toCharArray();

        int upperCaseLetters = 0;
        int lowerCaseLetters = 0;
        for (char letter : letters) {
            if (Character.isUpperCase(letter)) {
                upperCaseLetters++;
            } else {
                lowerCaseLetters++;
            }
        }

        if (upperCaseLetters > lowerCaseLetters) {
            System.out.println(input.toUpperCase());
        } else if (upperCaseLetters <= lowerCaseLetters) {
            System.out.println(input.toLowerCase());
        }
    }

    /*
    two conditions to follow:
    1. upper case letters > lower case letters ==> Upper case all the letters
    2. upper case letters <= lower case letters ==> Lower case all the letters

    How to identify whether a letter is uppercase or lowercase?
    */
}
