//  B. Regular Bracket Sequence

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
        char[] brackets = input.toCharArray();
        Stack<Character> bracketStack = new Stack<>();

        int count = 0;
        for (char bracket : brackets) {
            if (bracket == '(') {
                bracketStack.push('(');
            } else {
                if (!bracketStack.isEmpty()) {
                    bracketStack.pop();
                    count++;
                }
            }
        }

        System.out.println(count * 2);

    }
}
