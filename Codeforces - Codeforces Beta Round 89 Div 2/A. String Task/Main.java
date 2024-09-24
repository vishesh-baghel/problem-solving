//  A. String Task

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
        String[] letters = input.split("");

        StringBuilder stringBuilder = new StringBuilder();
        for (String letter : letters) {
            if (letter.toLowerCase().equals("a") || letter.toLowerCase().equals("e")
                    || letter.toLowerCase().equals("i") || letter.toLowerCase().equals("o")
                    || letter.toLowerCase().equals("u") || letter.toLowerCase().equals("y")
            ) {
                continue;
            } else {
                stringBuilder.append("." + letter.toLowerCase());
            }
        }

        System.out.println(stringBuilder.toString());
    }

    /*
    Required conditions:
    1. remove all vowels
    2. insert '.' before all consonents
    3. lowercase all consonents

    */
}
