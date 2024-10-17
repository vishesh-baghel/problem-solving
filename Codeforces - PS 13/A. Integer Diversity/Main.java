//  A. Integer Diversity

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
        List<Integer> numbers = Arrays.stream(input2.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int number : numbers) {
            int key = Math.abs(number);
            if (key != 0) {
                countMap.put(key, countMap.getOrDefault(key, 0) + 1);
            } else {
                countMap.put(0, 1);
            }
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() <= 2) {
                count += entry.getValue();
            } else {
                count = count + 2;
            }
        }

        System.out.println(count);
    }
}
