//  A. Elephant 617A

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
        int requiredDistance = Integer.parseInt(input);

        int steps = 0;
        while (true) {
            if (5 * steps <= requiredDistance && requiredDistance <= 5 * (steps + 1)) {
                System.out.println(steps + 1);
                return;
            }

            steps++;
        }

        /*
        0 - 5 => 5 --> 1 step
        5 - 10 => 10 = 5 + 5 --> 2 steps
        10 - 15 => 15 = 5 + 5 + 1 --> 3 steps
        15 - 20 => 16 = 5 + 5 + 5 + 1 --> 4 steps
        20 - 25 => 21 = 5 + 5 + 5 + 5 + 1 --> 5 steps
         */
    }
}
