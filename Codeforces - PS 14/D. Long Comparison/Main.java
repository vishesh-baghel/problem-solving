//  D. Long Comparison

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
        int testCases = Integer.parseInt(inputLines.get(0));
        for (int i = 1; i < (testCases * 2); i = i + 2) {
            printSolution(inputLines.get(i), inputLines.get(i + 1));
        }
    }

    public static void printSolution(String firstNumber, String secondNumber) {
        try {
            String[] firstNumberInputs = firstNumber.split(" ");
            String[] secondNumberInputs = secondNumber.split(" ");

            long firstInteger = Long.parseLong(firstNumberInputs[0]);
            int firstPower = Integer.parseInt(firstNumberInputs[1]);

            long secondInteger = Long.parseLong(secondNumberInputs[0]);
            int secondPower = Integer.parseInt(secondNumberInputs[1]);

            int minPower = Math.min(firstPower, secondPower);

            firstPower -= minPower;
            secondPower -= minPower;

            if (firstPower > 6) {
                System.out.println(">");
            } else if (secondPower > 6){
                System.out.println("<");
            } else {
                for (int i = 0; i < firstPower; i++) firstInteger *= 10;
                for (int i = 0; i < secondPower; i++) secondInteger *= 10;

                if (firstInteger > secondInteger) {
                    System.out.println(">");
                } else if (firstInteger < secondInteger) {
                    System.out.println("<");
                } else {
                    System.out.println("=");
                }
            }


        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    /*
    conditions:
    1. the two numbers are in this format: x(integer) and p(number of 0's to append)

    objective: to compare the two numbers and print '<', '>', '='
    '<' -> first smaller than second
    '>' -> first is greater than second
    '=' -> first is equal to second

    logic:
    1. TLE issue will happen if we solve this problem using brute force approach.
    2. the appending of 0's on the integers can be seen as multiplying it in the power of 10^p.
        integer1:  2 1 => 2 * 10^1 => 20
        integer2: 19 0 => 19 * 10^0 => 19
    3. we need to reduce the integers to fit in the datatypes and to avoid TLE.
    4. so, in order to reduce the size we can divide the integers by 10 until they become indivisible
    5. after that, to further reduce the size of integers we can remove the minimum of p1 and p2(here p1, p2 signifies the 10^p) trailing 0's
       since, removing the trailing 0's doesn't affect the comparison between the two integers.
    6. We can also check if p > 7 to immediatly decide whether a number is greater or not as compared to the other number.
       since, x1, x2 have upper limits of 10^6.

    */
}
