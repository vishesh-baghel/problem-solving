//  A. Petya and Strings

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
        char[] firstString = inputLines.get(0).toLowerCase().toCharArray();
        char[] secondString = inputLines.get(1).toLowerCase().toCharArray();

        for (int i = 0; i < firstString.length; i++) {
            if ((int) firstString[i] < (int) secondString[i]) {
                System.out.println("-1");
                return;

            } else if ((int) firstString[i] > (int) secondString[i]) {
                System.out.println("1");
                return;
            }
        }

        System.out.println("0");
    }
}
