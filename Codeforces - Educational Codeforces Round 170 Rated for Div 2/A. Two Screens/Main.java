//  A. Two Screens

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
        int inputLength = Integer.parseInt(inputLines.get(0)) * 2;
        for (int i = 1; i < inputLength; i = i + 2) {
            printSolution(inputLines.get(i), inputLines.get(i + 1));
        }
    }

    public static void printSolution(String s, String t) {
        int i = 0;
        int j = 0;
        int sLength = s.length();
        int tLength = t.length();
        int count = 0;

        while (sLength > 0 && tLength > 0) {
            if (s.charAt(i) == t.charAt(j)) {
                sLength--;
                tLength--;
                i++;
                j++;
            } else {
                break;
            }
        }

        if (sLength == 0) {
            count = count + s.length() // first screen
            count = count + 1 + t.length() - sLength; // second screen
        } else if (tLength == 0) {

        } else {
            count = count + sLength; // first
            count = count + i + tLength; // second
        }

        if (i < j) {
            count = i + 1
        }

        System.out.println(count);
    }

    /*
    logic:
    1. iterate on both the strings and compare each character to see if they are equal
    2. if they are equal then increment the count
    3. the momemt you find an unequal character in both the strings, count the rest of the characters in both the strings.


    AAAA
    AABB
    AA => 2
    copy => 2 + 1
    write on both screens => 3 + 2 + 2 = 7

    */
}
