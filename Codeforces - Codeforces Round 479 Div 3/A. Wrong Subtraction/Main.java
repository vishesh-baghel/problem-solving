//  A. Wrong Subtraction

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
        String[] inputs = input.split(" ");
        int number = Integer.parseInt(inputs[0]);
        int operations = Integer.parseInt(inputs[1]);
        
        for (int i = 0; i < operations; i++) {
            if (number % 10 != 0) {
                number -= 1;
            } else {
                number /= 10;
            }
        }

        System.out.println(number);
    }

    /*
    Two operations:
    1. substract 1 if last number is non-zero
    2. divide by 10 if last number is zero.

    do it k times

    */
}
