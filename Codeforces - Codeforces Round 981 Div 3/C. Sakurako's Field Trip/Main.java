//  C. Sakurako's Field Trip

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
        for (int i = 1; i < inputLines.size() - 1; i = i + 2) {
            printSolution(inputLines.get(i), inputLines.get(i + 1));
        }
    }

    public static void printSolution(String input1, String input2) {
        int length = Integer.parseInt(input1);
        List<Integer> interests = Arrays.stream(input2.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 1; i < length / 2; i++) {
            if (interests.get(i).equals(interests.get(i - 1)) || interests.get(length - i).equals(interests.get(length - i - 1))) {
                swap(interests, i, length - i - 1);
            }

            "".indexOf("")
        }

        System.out.println(calculateDisturbance(interests));
    }

    public static void swap(List<Integer> interests, int firstIndex, int secondIndex) {
        int temp = interests.get(firstIndex);
        interests.set(firstIndex, interests.get(secondIndex));
        interests.set(secondIndex, temp);
    }

    public static int calculateDisturbance(List<Integer> interests) {
        int disturbance = 0;
        for (int i = 0; i < interests.size() - 1; i++) {
            if (interests.get(i) == interests.get(i + 1)) {
                disturbance++;
            }
        }

        return disturbance;
    }

    /*
    2 1 2 2 1 1
    swap i = 2 <-> i = 6 - 2 + 1 = 5
    2 1 2 2 1 1
    swap i = 3 <-> i = 6 - 3 + 1 = 4
    2 2 1 2 1 1
    swap i = 4 <-> i = 6 - 4 + 1 = 3

    */
}
