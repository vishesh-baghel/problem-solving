//  B. Two-gram

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
        int inputSize = Integer.parseInt(inputLines.get(0));
        String input = inputLines.get(1);

        if (inputSize == 2) {
            System.out.println(input);
            return;
        }

        Map<String, Integer> twoGramCountMap = new HashMap<>();

        for (int i = 0; i < inputSize - 1; i++) {
            String twoGram = input.substring(i, i + 2);
            twoGramCountMap.put(twoGram, twoGramCountMap.getOrDefault(twoGram, 0) + 1);
        }

        int maxCount = 0;
        String twoGram = "";
        for (String key : twoGramCountMap.keySet()) {
            int currentCount = twoGramCountMap.get(key);
            if (currentCount > maxCount) {
                maxCount = currentCount;
                twoGram = key;
            }
        }

        System.out.println(twoGram);
    }

    /*
    conditions:
    1. input is always has length greater than 2
    2. twograms can overlap
    3. two grams is a substring of length 2 always

    objective: substring that repeats the most

    logic:
    1. Iterate on the input string to get all possible substrings.
    2. Create a map for keeping a record for the two-gram's count
    3. iterate on the map to get the two-gram which has the highest count

     */
}
