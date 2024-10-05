//  B. Delete from the Left

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
        printSolution(inputLines.get(0), inputLines.get(1));
    }

    public static void printSolution(String firstString, String secondString) {
        int i = firstString.length() - 1;
        int j = secondString.length() - 1;

        int sameCharsCount = 0;
        while (i >= 0 && j >= 0) {
            if (firstString.charAt(i) == secondString.charAt(j)) {
                sameCharsCount++;
            } else {
                break;
            }

            i--;
            j--;
        }

        int moves = (firstString.length() - sameCharsCount) + (secondString.length() - sameCharsCount);
        System.out.println(moves);
    }

    /*
    conditions:
    1. we can only delete the characters from the leftmost side
    2. two string can become empty and then become equal, in that case the answer would be sum of the legths of two strings.

    objective: fewest number of deletes to make the strings equal to each other.

    logic:
    1. start matching the letters from the end in both the strings
    2. maintain a counter to keep a count of same characters in both the strings
    2. when an different character is encountered at an index, then calculate
    3. moves = (length1 - count) + (length2 - count)

    */
}
