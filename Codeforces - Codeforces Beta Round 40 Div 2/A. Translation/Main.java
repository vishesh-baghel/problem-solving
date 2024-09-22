//  A. Translation

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
        char[] firstString = inputLines.get(0).toCharArray();
        char[] secondString = inputLines.get(1).toCharArray();

        if (firstString.length != secondString.length) {
            System.out.println("NO");
            return;
        }

        int i = 0;
        while (i < firstString.length) {
            if (firstString[i] != secondString[secondString.length - 1 - i]) {
                System.out.println("NO");
                return;
            }

            i++;
        }

        System.out.println("YES");
    }
}
