//  A. Presents

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
        int n = Integer.parseInt(inputLines.get(0));
        String[] friendNumbers = inputLines.get(1).split(" ");

        Map<Integer, Integer> giftMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            giftMap.put(Integer.parseInt(friendNumbers[i]), i + 1);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(giftMap.get(i + 1) + " ");
        }
    }

    /*
    conditions:
    print the number of the friend in ascending order

    logic:
    We need to map the index of each friend starting from 1 to n
    test case 1:
    2 <-> 1
    3 <-> 2
    4 <-> 3
    1 <-> 4

    print the number in ascending order
    1 -> 4
    2 -> 1
    3 -> 2
    4 -> 3

    */

}
