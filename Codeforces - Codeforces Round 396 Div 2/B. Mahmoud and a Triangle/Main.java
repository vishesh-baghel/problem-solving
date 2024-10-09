//  B. Mahmoud and a Triangle

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.Collectors;

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
        int length = Integer.parseInt(inputLines.get(0));
        List<Long> segments = Arrays.stream(inputLines.get(1).split(" ")).map(Long::parseLong).collect(Collectors.toList());
        Collections.sort(segments);

        int i = 0;
        while (i < length - 2) {
            long first = segments.get(i);
            long second = segments.get(i + 1);
            long third = segments.get(i + 2);

            if (first + second > third) {
                System.out.println("YES");
                return;
            }

            i++;
        }

        System.out.println("NO");
    }

    /*
    conditions:
    1. choose exactly 3 segments
    2. can't concatenate and increase the length of the segments.

    observations:
    1.

    objective: print yes or no if a non-degenerate triangle can be formed.

    logic:
    1. check if sum of any two sides is greater than the third side

    */
}
