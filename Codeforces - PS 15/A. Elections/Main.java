//  A. Elections

import java.math.BigInteger;
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
        int size = Integer.parseInt(inputLines.get(0));
        for (int i = 1; i < size + 1; i++) {
            printSolution(inputLines.get(i));
        }
    }

    public static void printSolution(String input) {
        String[] votes = input.split(" ");
        long a = Long.parseLong(votes[0]);
        long b = Long.parseLong(votes[1]);
        long c = Long.parseLong(votes[2]);

        long requiredVotesA = Math.max(0, Math.max(b, c) + 1 - a);
        long requiredVotesB = Math.max(0, Math.max(a, c) + 1 - b);
        long requiredVotesC = Math.max(0, Math.max(a, b) + 1 - c);

        System.out.println(requiredVotesA + " " + requiredVotesB + " " + requiredVotesC);
    }

    /*
    logic:
    how to find largest?
    simple loop

    how to handle zeros?

    */
}
