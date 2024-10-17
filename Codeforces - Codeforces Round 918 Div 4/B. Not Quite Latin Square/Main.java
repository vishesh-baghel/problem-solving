//  B. Not Quite Latin Square

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
        int inputLength = Integer.parseInt(inputLines.get(0)) * 3;
        for (int i = 1; i < inputLength + 1; i++) {
            printSolution(inputLines.get(i));
        }
    }

    public static void printSolution(String input) {
        if (input.contains("?") && input.contains("A") && input.contains("B")) {
            System.out.println("C");
        } else if (input.contains("?") && input.contains("B") && input.contains("C")) {
            System.out.println("A");
        } else if (input.contains("?") && input.contains("A") && input.contains("C")) {
            System.out.println("B");
        }
    }
}
