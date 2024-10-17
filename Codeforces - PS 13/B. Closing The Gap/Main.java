//  B. Closing The Gap

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
        int inputLength = Integer.parseInt(inputLines.get(0)) * 2;
        for (int i = 1; i < inputLength; i = i + 2) {
            printSolution(inputLines.get(i), inputLines.get(i + 1));
        }
    }

    public static void printSolution(String input1, String input2) {
        int inputLength = Integer.parseInt(input1);
        List<Integer> heights = Arrays.stream(input2.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        double sum = 0;
        for (int i = 0; i < inputLength; i++) {
            sum += heights.get(i);
        }

        double avg = sum / inputLength;
        double ceil = Math.ceil(avg);
        double floor = Math.floor(avg);

        System.out.println((int)(ceil - floor));
    }

    /*
    s: 2 5 2 5 6 => 1 if sorted: 2 2 5 5 6 => 0
    1. 3 4 2 5 6
    2. 3 4 3 4 6
    3. 4 4 3 4 5
    4. 4 4 4 4 4
    ans 0

    */
}
