//  B. Decoding

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
        printSolution(inputLines.get(0), inputLines.get(1));
    }

    public static void printSolution(String inputLength, String encodedInput) {
        int length = Integer.parseInt(inputLength);
        char[] encodedChars = encodedInput.toCharArray();

        if (length % 2 != 0) {
            StringBuilder first = new StringBuilder();
            StringBuilder second = new StringBuilder();

            for (int i = 0; i < length; i++) {
                if (i % 2 != 0) {
                    first.append(encodedChars[i]);
                } else {
                    second.append(encodedChars[i]);
                }
            }

            first.reverse();
            first.append(second);

            System.out.println(first);
        } else {
            StringBuilder first = new StringBuilder();
            StringBuilder second = new StringBuilder();

            for (int i = 0; i < length; i++) {
                if (i % 2 == 0) {
                    first.append(encodedChars[i]);
                } else {
                    second.append(encodedChars[i]);
                }
            }

            first.reverse();
            first.append(second);

            System.out.println(first);
        }
    }

    /*
    conditions:
    1. for even length string, the left of the middle two is considered as median
    2. for odd length string, the middle character is considered as median

    objective: to decode the string from it's encoded form.

    logic:
    1. we need to reverse the technique used for encoding.
    2. for odd length, pick odd places in the string and construct a new string
    3. for even lenght, pick even places in the string and construct a new string.
    4. reverse the new string and append it to the rest of the string at the start.

    FOR ODD LENGTH INPUT:
    encoding: volga -> l , voga -> lo , vga -> log , va -> logv , a -> logva
    apple: p, aple -> pp, ale -> ppl, ae -> ppla, e -> pplae

    FOR EVEN LENGTH INPUT:
    abcd -> b, acd -> bc, ad -> bca, d -> bcad
    abcdef -> c, abdef -> cd, abef -> cdb, aef -> cdbe, af -> cdbea, f -> cdbeaf

    */
}
