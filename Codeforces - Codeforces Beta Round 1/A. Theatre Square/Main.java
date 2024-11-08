//  A. Theatre Square

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
        String[] inputs = input.split(" ");
        long n = Long.parseLong(inputs[0]);
        long m = Long.parseLong(inputs[1]);
        long a = Long.parseLong(inputs[2]);

        long segment1 = (long) Math.ceil((n + a - 1) / a);
        long segment2 = (long) Math.ceil((m + a - 1) / a);

        System.out.println(segment1 * segment2);
    }
}
