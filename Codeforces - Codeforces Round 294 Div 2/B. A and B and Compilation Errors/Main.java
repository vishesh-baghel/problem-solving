//  B. A and B and Compilation Errors

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
        int lengthOfInputs = Integer.parseInt(inputLines.get(0));
        List<Integer> firstAttemptErrors = Arrays.stream(inputLines.get(1).split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondAttemptErrors = Arrays.stream(inputLines.get(2).split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> thirdAttemptErrors = Arrays.stream(inputLines.get(3).split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int firstArraySum = firstAttemptErrors.stream().mapToInt(Integer::intValue).sum();
        int secondArraySum = secondAttemptErrors.stream().mapToInt(Integer::intValue).sum();
        int thirdArraySum = thirdAttemptErrors.stream().mapToInt(Integer::intValue).sum();

        System.out.println(firstArraySum - secondArraySum);
        System.out.println(secondArraySum - thirdArraySum);
    }

    /*
    conditions:
    1. n >=3
    2. there can be multiple errors with the same number and B can correct one at each step.
    observations:
    1. only two attempts are made


    objective: number of compilation error that were solved in first and second attempts.

    logic:
    1. first array has all elements
    2. second array has all first elements except for 1 element
    3. third array has all second elements except for 1 element.
    4. the answer would be the difference in the sums of first, second and third
    */
}
