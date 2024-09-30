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
        double n = Double.parseDouble(inputs[0]);
        double k = Double.parseDouble(inputs[1]);

        double nearestNumber = Math.floor(Math.sqrt(n));

        if ((int)nearestNumber == k) {
            System.out.println("1");
            return;
        }
        int operations = 0;
        int x = 0;

        System.out.println(operations);
    }

    /*
    conditions:
    1. substract any power of k from n to make it 0

    objective: find the number of operations required to make n = 0;

    logic:
    1. find square root of n
    2. if square root matches k then operation is 1 always

    5 2
    1. 5 - 2^0 = 5 - 1 = 4
    2. 5 - 2^2 = 5 - 4 = 0
    ops: 2

    100 3
    1. 100 - 3^4 = 100 - 81 = 19
    2. 19 - 3^3 = 19 - 9 = 10
    3. 10 - 3^3 = 10 - 9 = 1
    4. 1 - 3^0 = 1 - 1 = 0


    */
}
