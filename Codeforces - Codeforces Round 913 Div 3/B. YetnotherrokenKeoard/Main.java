//  B. YetnotherrokenKeoard

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
        for (int i = 1; i < inputLines.size(); i++) {
            printSolution(inputLines.get(i));
        }
    }

    public static void printSolution(String input) {
        Stack<Character> upperCaseLetters = new Stack<>();
        Stack<Character> lowerCaseLetters = new Stack<>();

        char[] letters = input.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (Character.isUpperCase(letters[i]) && letters[i] != 'B') {
               upperCaseLetters.push(letters[i]);
            } else if (Character.isLowerCase(letters[i]) && letters[i] != 'b'){
                lowerCaseLetters.push(letters[i]);
            }

            if (letters[i] == 'B' && !upperCaseLetters.isEmpty()) {
                upperCaseLetters.pop();
            }

            if (letters[i] == 'b' && !lowerCaseLetters.isEmpty()) {
                lowerCaseLetters.pop();
            }
        }

        StringBuilder result1 = new StringBuilder();
        while(!upperCaseLetters.isEmpty()) {
            result1.append(upperCaseLetters.pop());
        }

        StringBuilder result2 = new StringBuilder();
        while(!lowerCaseLetters.isEmpty()) {
            result2.append(lowerCaseLetters.pop());
        }

        System.out.println(result1.reverse().toString() + result2.reverse().toString());
    }

    /*
    Segregate the uppercase and lowercase letters and perform the delete operations in the left hand side only
    ARBB abbitaby => ity

    B ubble => le

    */
}
