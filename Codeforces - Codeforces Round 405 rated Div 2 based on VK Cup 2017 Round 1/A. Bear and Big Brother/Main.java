//  A. Bear and Big Brother

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
        int limakWeight = Integer.parseInt(input.split(" ")[0]);
        int bobWeight = Integer.parseInt(input.split(" ")[1]);

        int year = 1;
        while (true) {
            limakWeight = limakWeight * 3;
            bobWeight = bobWeight * 2;

            if (limakWeight > bobWeight) {
                break;
            }

            year++;
        }

        System.out.println(year);
    }
}
