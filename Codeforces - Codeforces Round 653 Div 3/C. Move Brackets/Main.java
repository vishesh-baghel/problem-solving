//  C. Move Brackets

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.Collectors;

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
        int inputLength = Integer.parseInt(inputLines.get(0)) * 2;
        for (int i = 1; i < inputLength; i = i + 2) {
            printSolution(inputLines.get(i), inputLines.get(i + 1));
        }
    }

    public static void printSolution(String length, String bracketsString) {
        List<String> brackets = Arrays.stream(bracketsString.split("")).collect(Collectors.toList());
        int moves = 0;
        int balance = 0;
        for (int i = 0; i < brackets.size(); i++) {
            if (brackets.get(i).equals("(")) {
                balance++;
            } else {
                balance--;
                if (balance < 0) {
                    balance = 0;
                    moves++;
                }
            }
        }

        System.out.println(moves);
    }
}
