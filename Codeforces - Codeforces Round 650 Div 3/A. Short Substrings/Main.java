//  A. Short Substrings

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
        inputLines.remove(0);
        for (String line : inputLines) {
            printSolution(line.trim());
        }
    }

    public static void printSolution(String input) {
        char[] characters = input.toCharArray();
        StringBuilder finalString = new StringBuilder();

        for (int i = 1; i < characters.length; i++) {
            finalString.append(characters[i - 1]);
            if (characters[i - 1] == characters[i]) {
                i++;
            }
        }
        finalString.append(characters[characters.length - 1]);

        System.out.println(finalString);
    }

    /*
    conditions:
    1. b is atleast 2 character long
    2. first and last characters must be present in the final string

    objective: to construct a string from its substrings

    logic:
    1. iterate on the char array
    2. if a same character is found, then skip that character and move to the next character.

    */
}
