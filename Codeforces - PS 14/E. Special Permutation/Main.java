//  E. Special Permutation

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
        int testCases = Integer.parseInt(inputLines.get(0));
        for (int i = 1; i < testCases; i++) {
            printSolution(inputLines.get(i));
        }
    }

    public static void printSolution(String input) {
        System.out.println(input);
    }

    /*
    constraints:
    1. inclusive of n and exactly once permutations
    2. n is always even
    3. a != b

    observations:
    1.

    objective: print any permutation such that min of left half is equal to max of right half otherwise -1
    if multiple answers, then print any of them

    logic:
    1.

    6 1 3
    perm: 1 2 4 3 5 6

    */
}
