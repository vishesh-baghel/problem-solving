//  A. Even Odds 318A

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
        long n = Long.parseLong(input.split(" ")[0]);
        long k = Long.parseLong(input.split(" ")[1]);

        long midPoint = (n + 1) / 2;

        if (k <= midPoint) {
            System.out.println(k * 2 - 1);
        } else {
            System.out.println((k - midPoint) * 2);
        }
    }

    /*
    input 1: 10 3
    1, 3, 5, 7, 9, 2, 4, 6, 8, 10 --> 5

    input 2: 7 7
    1, 3, 5, 7, 2, 4, 6 --> 6

    inputs 3: 1 1
    1 --> 1

    input 4: 2 1
    1, 2 --> 1

    input 5: 3 2
    1, 3, 2 --> 3

    input 6: 4 2
    1, 3, 2, 4 --> 3

    input 7: 5 4
    1, 3, 5, 2, 4 --> 2

    input 8: 6 2
    1, 3, 5, 2, 4, 6 --> 3

    7, 1 ==> 1, 3, 5, 7, 2, 4, 6 --> 1
    7, 2 ==> 1, 3, 5, 7, 2, 4, 6 --> 3
    7, 3 ==> 1, 3, 5, 7, 2, 4, 6 --> 5
    7, 4 ==> 1, 3, 5, 7, 2, 4, 6 --> 7
    7, 5 ==> 1, 3, 5, 7, 2, 4, 6 --> 2

    obs 1: middle position will be occupied by n if n is odd
    obs 2: last position will be occupied by n if n is even
    */
}
