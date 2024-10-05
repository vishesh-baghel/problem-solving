//  A. cAPS lOCK

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
        String rest = input.substring(1);
        if (Character.isLowerCase(input.charAt(0)) && areAllLettersUpperCase(rest)) {
            System.out.println(String.valueOf(input.charAt(0)).toUpperCase() + rest.toLowerCase());

        } else if (areAllLettersUpperCase(input)) {
            System.out.println(input.toLowerCase());

        } else {
            System.out.println(input);
        }
    }

    public static boolean areAllLettersUpperCase(String input) {
        char[] inputChars = input.toCharArray();
        for (int i = 0; i < inputChars.length; i++) {
            if (!Character.isUpperCase(inputChars[i])) {
                return false;
            }
        }

        return true;
    }

    /*
    conditions:
    1. a string is written accidently when all letters are capitalized or except of first, rest of the letters are capitalized.
    2. if the first letter is in upper case and rest of the letters are in lower case then don't perform any transformations on that string.

    objective: transform the string in which first letter is capitalized and rest of the letters are in lower case.

    logic:
    1. transform the first letter in upper case for all inputs
    2. transform the rest of the letters in lower case for all inputs.

    */
}
