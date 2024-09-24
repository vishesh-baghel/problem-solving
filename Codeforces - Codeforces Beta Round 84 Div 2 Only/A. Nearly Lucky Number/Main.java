//  A. Nearly Lucky Number

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
        String[] inputs = input.split("");
        int count = 0;
        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i].equals("4") || inputs[i].equals("7")) {
                ++count;
            }
        }

        if (count == 4 || count == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
