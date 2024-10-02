//  B. Square String?

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
        char[] charArray = input.toCharArray();

        int length = charArray.length;
        if (length % 2 != 0) {
            System.out.println("NO");
            return;
        }

        for (int i = 0; i < length / 2; i++) {
            if (charArray[i] != charArray[(length / 2) + i]) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

    /*
    conditions:
    1. a string is square if duplicate characters are present in the subsequent characters.

    objective: identify whether a given string is square or not

    logic:
    1. we need to check if ith and n / 2 + ith character are same or not

    abab
     */
}
