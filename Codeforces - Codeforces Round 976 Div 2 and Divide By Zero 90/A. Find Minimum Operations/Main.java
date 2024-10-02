//  A. Find Minimum Operations

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
        inputLines.remove(0);
        for (String line : inputLines) {
            printSolution(line.trim());
        }
    }

    public static void printSolution(String input) {
        String[] inputs = input.split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);

        if (k == 1) {
            System.out.println(n);
            return;
        }

        int operations = 0;
        while (n > 0) {
            operations += n % k;
            n /= k;
        }

        System.out.println(operations);
    }

    /*
    conditions:
    1. substract any power of k from n to make it 0

    objective: find the number of operations required to make n = 0;

    logic:
    1. we will use this formula: dividend = divisor * quotient + remainder
    2. iterate until n becomes 0
    3. at each step we will calculate the remainder(it is the number of substractive operations) and then,
    4. the quotient represents the next portion that needs to be processed, which will be available
        after dividing it again by k.

    */
}
