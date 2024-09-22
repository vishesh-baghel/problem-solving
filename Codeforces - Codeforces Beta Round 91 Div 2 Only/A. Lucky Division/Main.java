import java.util.*;
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
        int number = Integer.parseInt(input);
        int[] luckyNumbers = {
                4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777
        };

        for (int luckyNumber : luckyNumbers) {
            if (number % luckyNumber == 0) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
