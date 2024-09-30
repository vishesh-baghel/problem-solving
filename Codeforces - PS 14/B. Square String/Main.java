//  B. Square String?

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
        char[] charArray = input.toCharArray();

        if (charArray.length == 1) {
            System.out.println("NO");
            return;
        }

        int i = 0;
        int j = 1;
        while (i < charArray.length) {
            if (charArray[i] != charArray[j]) {
                j++;
            } else {
                break;
            }
        }

        String pattern = input.substring(0, j);
        String restString = input.substring(j, charArray.length);

         

    }

    /*
    conditions:
    1. a string is square if duplicate characters are present in the subsequent characters.

    objective: identify whether a given string is square or not

    logic:
    1. select the first char as the starting point for a pattern
    2. iterate on the char array and find the index at which I find the same character
    3. then from 0 to the found index, take a substring which is a pattern to match in the rest of the string
    4. if I don't find it then return no otherwise yes.

     */
}
