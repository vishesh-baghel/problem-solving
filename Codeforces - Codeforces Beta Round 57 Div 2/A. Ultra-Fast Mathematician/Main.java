//  A. Ultra-Fast Mathematician 61A

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
        String firstNumber = inputLines.get(0);
        String secondNumber = inputLines.get(1);

        String[] firstNumberDigits = firstNumber.split("");
        String[] secondNumberDigits = secondNumber.split("");

        int iterator = 0;
        String result = "";

        while (iterator < firstNumber.length()) {
            if (firstNumberDigits[iterator].equals(secondNumberDigits[iterator])) {
                result += "0";
            } else {
                result += "1";
            }

            iterator++;
        }

        System.out.println(result);
    }

    /*
    1 ^ 1 = 0
    1 ^ 0 = 1
    0 ^ 0 = 0
    0 ^ 1 = 1
     */
}
