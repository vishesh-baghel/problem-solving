//  C. Replace To Make Regular Bracket Sequence

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
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('>', '<');
        map.put('}', '{');
        int ans = 0;

        for (char bracket : brackets) {
            if (bracket == '(' || bracket == '[' || bracket == '<' || bracket == '{') {
                bracketStack.push(bracket);
            } else {
                if (bracketStack.isEmpty()) {
                    System.out.println("Impossible");
                    return;
                }

                if (bracketStack.peek() == map.get(bracket)) {
                    bracketStack.pop();
                } else {
                    bracketStack.pop();
                    ans++;
                }
            }
        }

        if (!bracketStack.isEmpty()) {
            System.out.println("Impossible");
            return;
        }

        System.out.println(ans);
    }

    /*
    constraints:
    1. can replace only opening brackets with other opening brackets and same goes for closing brackets
    2. print impossible if getting rbs is not forming by replacing brackets by any type

    objective: to find the minimum number of replaces to make the string RBS

    observations:

    logic:

    */
}
