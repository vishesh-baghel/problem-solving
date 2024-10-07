//  B. String LCM

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
        for (int i = 1; i < inputLines.size(); i = i + 2) {
            printSolution(inputLines.get(i), inputLines.get(i + 1));
        }
    }

    public static void printSolution(String firstString, String secondString) {
        if (firstString.length() == secondString.length()) {
            if (firstString.equals(secondString)) {
                System.out.println(firstString);
            } else {
                System.out.println(-1);
            }
            return;
        }

        // ensure that the first string is always smaller
        if (firstString.length() > secondString.length()) {
            String temp = firstString;
            firstString = secondString;
            secondString = temp;
        }

        int len1 = firstString.length();
        int len2 = secondString.length();

        int lcm = (len1 * len2) / GCD(len1, len2);

        StringBuilder answer = new StringBuilder();
        int k = 0;

        for (int i = 0; i < lcm; i++) {
            answer.append(firstString.charAt(k));
            k = (k + 1) % len1;
        }

        // validate the lcm by comparing it with second string
        k = 0;
        for (int i = 0; i < lcm; i++) {
            if (answer.charAt(i) != secondString.charAt(k)) {
                System.out.println(-1);
                return;
            }
            k = (k + 1) % len2;
        }

        System.out.println(answer.toString());
    }

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return GCD(b, a % b);
    }
}
