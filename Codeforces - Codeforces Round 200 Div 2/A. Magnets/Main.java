//  A. Magnets

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
        int numberOfMagnets = Integer.parseInt(inputLines.get(0));
        inputLines.remove(0);

        int groups = 0;
        for (int i = 1; i < numberOfMagnets; i++) {
            int rightPoleOfPreviousMagnet = Integer.parseInt(inputLines.get(i - 1).split("")[1]);
            int leftPoleOfNextMagnet = Integer.parseInt(inputLines.get(i).split("")[0]);

            if (rightPoleOfPreviousMagnet == leftPoleOfNextMagnet) {
                groups++;
            }
        }

        System.out.println(groups + 1);
    }

    /*
    conditions:
    1. groups are formed when same pole is kept side by side
    2. a single magnet can also form a group

    logic:
    compare each pair of `10` or `01 and see if the first bit is same or not
    if the first bit is same then increase the number of groups


    */
}
