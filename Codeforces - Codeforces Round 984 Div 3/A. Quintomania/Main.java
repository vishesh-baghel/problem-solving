//  A. Quintomania

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
        int length = Integer.parseInt(inputLines.get(0)) * 2;
        for (int i = 1; i < length; i += 2) {
            printSolution(inputLines.get(i), inputLines.get(i + 1));
        }
    }

    public static void printSolution(String length, String input) {
        String[] notes = input.split(" ");
        for (int i = 0; i < notes.length - 1; i++) {
            int first = Integer.parseInt(notes[i]);
            int second = Integer.parseInt(notes[i + 1]);

            int diff = Math.abs(first - second);
            if (diff == 5 || diff == 7) {
                continue;
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
