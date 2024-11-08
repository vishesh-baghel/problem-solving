//  B. Startup

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
        int i = 1;
        while (i < inputLines.size()) {
            String[] inputs = inputLines.get(i).split(" ");
            int shelves = Integer.parseInt(inputs[0]);
            int bottles = Integer.parseInt(inputs[1]);
            printSolution(shelves, inputLines.subList(i + 1, i + 1 + bottles));

            i += bottles + 1;
        }
    }

    public static void printSolution(int numberOfShelves, List<String> bottles) {
        Integer[] brandCosts = new Integer[bottles.size()];
        Arrays.fill(brandCosts, 0);

        for (String bottleCost : bottles) {
            String[] bottleInfo = bottleCost.split(" ");
            int brand = Integer.parseInt(bottleInfo[0]);
            int cost = Integer.parseInt(bottleInfo[1]);
            brandCosts[brand - 1] += cost;
        }

        Arrays.sort(brandCosts, Collections.reverseOrder());

        int iterations = Math.min(numberOfShelves, bottles.size());
        int cost = 0;
        for (int i = 0; i < iterations; i++) {
            cost += brandCosts[i];
        }

        System.out.println(cost);
    }
}
