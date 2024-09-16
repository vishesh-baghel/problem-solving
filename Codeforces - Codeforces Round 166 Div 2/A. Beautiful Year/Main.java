//  A. Beautiful Year 271A

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
        int startingYear = Integer.parseInt(input) + 1;

        while (true) {
            // continue to check the year until I get distinct digits
            if (checkIfYearHasDistinctDigits(startingYear)) {
                break;
            }

            startingYear++;
        }

        System.out.println(startingYear);
    }

    public static boolean checkIfYearHasDistinctDigits(int startingYear) {
        char[] digits = String.valueOf(startingYear).toCharArray();
        Arrays.sort(digits);
        for (int i = 1; i < digits.length; i++) {
            if (digits[i - 1] == digits[i]) {
                return false;
            }
        }

        // stop when the digits are distinct
        return true;
    }

    /*
    1987 --> all distinct digits
    1988 --> 8 is repeating
    1988 - 1999 --> some digits are repeating
    2000 - 2012 --> some digits are repeating
    2013 --> no digit is repeating

    require minimum year with distinct digit
     */
}
