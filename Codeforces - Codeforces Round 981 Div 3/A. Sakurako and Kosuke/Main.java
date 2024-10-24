//  A. Sakurako and Kosuke

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
        for (int i = 1; i < inputLines.size(); i++) {
            printSolution(inputLines.get(i));
        }
    }

    public static void printSolution(String input) {
        int n = Integer.parseInt(input);
        if (n % 2 == 0) {
            System.out.println("Sakurako");
        } else {
            System.out.println("Kosuke");
        }
    }

    /*
    2i - 1
    n = 6 or -6
    1: 1
    2: 3
    3: -2
    4: 5
    5: -4
    6: 7

    n = 3
    1: 1
    2: 3

    n = 4
    1: 1
    2: 3
    3: -2
    4: 5

    */
}
