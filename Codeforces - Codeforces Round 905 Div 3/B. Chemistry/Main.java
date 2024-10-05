//  B. Chemistry

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

    public static void printSolution(String nAndk, String inputString) {
        String[] inputs = nAndk.split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);

        char[] letters = inputString.toCharArray();

        Map<Character, Integer> letterCountMap = new HashMap<>();

        for (int i = 0; i < letters.length; i++) {
            letterCountMap.put(letters[i], letterCountMap.getOrDefault(letters[i], 0) + 1);
        }

        int odds = 0;
        for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                odds++;
            }
        }

        if (odds > k + 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    /*
    conditions:
    1. all letters are lower case only
    2. remove exactly k characters.
    3. we can reorder the characters in any order to form a palindrome.

    observations:
    1. characters are being removed from the start and end indexes in the sample inputs.

    objective: to remove exactly k characters from an input string and reorder the characters
    to form a palindrome.

    logic:
    1. we need to make a frequency map to count the letters which are having odd number of occurances
    2. if odd occurance > k + 1, then print No otherwise Yes

    */
}
