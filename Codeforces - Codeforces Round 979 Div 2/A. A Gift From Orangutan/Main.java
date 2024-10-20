//  A. A Gift From Orangutan

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

    public static void printSolution(String inputLength, String inputArray) {
        int length = Integer.parseInt(inputLength);
        List<Integer> elements = Arrays.stream(inputArray.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.sort(elements);
        int minElement = elements.get(0);
        int maxElement = elements.get(length - 1);

        int sum = (maxElement - minElement) * (length - 1);
        System.out.println(sum);
    }

    /*
    1 1 1 2 2
    b: 1 1 1 1 1
    c: 1 2 2 2 2
    1 - 1 + 2 - 1 + 2 - 1 + 2 - 1 + 2 - 1

    */
}
