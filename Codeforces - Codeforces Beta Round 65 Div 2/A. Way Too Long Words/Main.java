//  A. Way Too Long Words

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
            printSolution(line);
        }
    }

    public static void printSolution(String input) {
        if (input.length() <= 10) {
            System.out.println(input);
            return;
        }

        String trimedInput = input.trim();
        char[] chars = trimedInput.toCharArray();
        int length = chars.length;

        String abbr = chars[0] + String.valueOf(length - 2) + chars[length - 1];
        System.out.println(abbr);
    }
}