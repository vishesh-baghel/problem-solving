//  C. Rudolf and the Ugly String

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
        if (!Character.isLetter(input.toCharArray()[0])) {
            return;
        }

        int count = 0;
        for (int i = 0; i < input.length() - 2; i++) {
            String word = input.substring(i, i + 3);

            if (word.equals("pie") || word.equals("map")) {
                count++;
            }
        }

        for (int i = 0; i < input.length() - 4; i++) {
            String word = input.substring(i, i + 5);

            if (word.equals("mapie")) {
                count--;
            }
        }
        System.out.println(count);
    }

    /*
    conditions:
    1. ugly string contains either of these two strings: map or pie
    2. it is okay to delete a character from anywhere in the input string
    3. If a input string is already beautiful then return 0.

    objective: minimum number of delete operations to make a input string beautiful

    logic:
    1. Count the number of ugly strings occurences while doing substrings of size 3.
    2. We just need to remove a single character from them to make an input string beautiful again.
    3. if non of the substrings match the ugly words, then that input string is already beautiful, so the count won't get incremented.

    */
}
