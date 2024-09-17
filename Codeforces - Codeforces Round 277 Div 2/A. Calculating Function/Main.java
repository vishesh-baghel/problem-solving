//  A. Calculating Function 486A

import java.math.BigInteger;
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
        BigInteger inputNumber = new BigInteger(input);
        BigInteger two = BigInteger.valueOf(2);

        BigInteger minusOnePower = (inputNumber.mod(two).equals(BigInteger.ZERO)) ? BigInteger.ONE : BigInteger.valueOf(-1);

        if (inputNumber.mod(two).equals(BigInteger.ZERO)) {
            BigInteger result = minusOnePower.multiply(inputNumber).divide(two);
            System.out.println(result);
        } else {
            BigInteger floorResult = inputNumber.divide(two);
            BigInteger result = minusOnePower.multiply(inputNumber).add(floorResult);
            System.out.println(result);
        }
    }

    /*
    (-1)^^n * n

    for odd input:
    1 --> -1
    3 --> -3 + (3/2) --> -3 + 1 = -2
    5 --> -5 + (5/2) --> -5 + 2 = -3
    7 --> -7 + (7/2) --> -7 + 3 = -4

    i --> -i
    i + 1 --> i
    i + 2 --> -2i
    i + 3 --> 2i

    1 => -1
    2 => -1 + 2 = 1
    3 => -1 + 2 - 3 = -2
    4 => -1 + 2 - 3 + 4 = 2
    5 => -1 + 2 - 3 + 4 - 5 = -3
    6 => -1 + 2 - 3 + 4 - 5 + 6 = 3
    7 => -1 + 2 - 3 + 4 - 5 + 6 - 7 = -4
    8 => -1 + 2 - 3 + 4 - 5 + 6 - 7 + 8 = 4
     */
}
