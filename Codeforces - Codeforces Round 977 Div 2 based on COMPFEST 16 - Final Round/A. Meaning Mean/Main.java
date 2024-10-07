//  A. Meaning Mean

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
        for (int i = 1; i < inputLines.size(); i = i + 2) {
            printSolution(inputLines.get(i), inputLines.get(i + 1));
        }
    }

    public static void printSolution(String arraySize, String inputArray) {
        List<Integer> inputs = Arrays.stream(inputArray.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (inputs.size() >= 2) {
            Collections.sort(inputs);
            int first = 0;
            int second = 0;

            first = inputs.remove(0);
            second = inputs.remove(1);
            inputs.add((int) Math.floor((first + second) / 2));
        }

        System.out.println((int) Math.floor((inputs.get(0) + inputs.get(1)) / 2));
    }

    /*
    observations:
    1. picked indexes should be different from previous operation
    2. there can be multiple answers, I need to pick the max number of operations

    input : 1 7 8 4 5
    1. picked index 0, 1 -> 8 4 5 4
    2. picked index 0, 1 -> 5 4 6
    3. picked index 0, 1 -> 6 4
    4. picked index 0, 1 -> 5 wrong

    input : 1 7 8 4 5
    1. picked index 0, 1 -> 8 4 5 4
    2. picked index 1, 2 -> 8 4 4
    3. picked index 0, 1 -> 4 6
    4. picked index

    input : 1 7 8 4 5
    sorted: 1 4 5 7 8
    1. picked inde 0, 1 -> 5 7 8 2
    2. picked index 0, 1 -> 8 2 6
    3. picked index 0, 1 -> 6 5
    4. picked index 0, 1 -> 5

    input : 1 7 8 4 5
    sorted reverse: 8 7 5 4 1
    1. picked index 0, 1 -> 5 4 1 7
    2. picked index 0, 1 -> 1 7 4
    3. picked index 0, 1 -> 4 4
    4. picked index 0, 1 -> 4

    input : 1 7 8 4 5
    pick index 0, 1 -> 8 4 5 4
    pick index 1, 2 -> 8 4 4
    pick index 3, 4 -> 8 4
    pick index 1, 2 -> 6

    input: 2 6 5
    pick index 0, 1 -> 5 4
    pick index 0, 1 -> 4

    input: 5 5 5 5 5
    pick index 0, 1 -> 5 5 5 5
    pick index 1, 2 -> 5 5 5
    pick index

    input : 1 7 8 4 5
    sort: 1 4 5 7 8
    1. pick index 0, 1 -> 5 7 8 2 -> 2 5 7 8
    2. pick index 0, 1 -> 7 8 3 -> 3 7 8
    3. pick index 0, 1 -> 8 5
    4. pick index 0, 1 -> 6

    input : 1 7 8 4 5
    sort: 7 8 5 4 1
    1. pick index 0, 1 -> 5 4 1 7 -> 7 5 4 1
    2. pick index 0, 1 -> 4 1 6 -> 6 4 1
    3. pick index 0, 1 -> 1 5
    4. pick index 0, 1 -> 3


    */
}
