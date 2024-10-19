//  C. Word on the Paper

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
        int inputLength = Integer.parseInt(inputLines.get(0)) * 8;
        for (int i = 1; i < inputLength - 1; i = i + 8) {
            printSolution(inputLines.subList(i, i + 8));
        }
    }

    public static void printSolution(List<String> lines) {
        for (String line : lines) {
            String[] letters = line.split("");
            for (String letter : letters) {
                if (!letter.equals(".")) {
                    System.out.print(letter);
                }
            }
        }

        System.out.println("");
    }
}
