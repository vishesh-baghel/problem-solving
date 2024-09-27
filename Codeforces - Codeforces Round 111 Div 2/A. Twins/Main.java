//  A. Twins

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
        int numberOfCoins = Integer.parseInt(inputLines.get(0));
        List<Integer> coins = Arrays.stream(inputLines.get(1).split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.sort(coins, Collections.reverseOrder());

        int totalSum = coins.stream().mapToInt(Integer::intValue).sum();

        int coinCount = 0;
        int selectedSum = 0;
        for (int i = 0; i < coins.size(); i++) {
            selectedSum += coins.get(i);
            coinCount++;

            if (selectedSum > totalSum - selectedSum) {
                break;
            }
        }

        System.out.println(coinCount);
    }

    /*
    Required conditions:
    1. minimum number of coins
    2. value of sum of all coins for the first twin should be strictly greater than the other twin

    logic:
    1. First reverse sort the list of coins so that we can get the largest sum value with minimum coins
    2. take sum of a window of coins and compare it with the sum of remaining coins
    3. break the loop as soon as the window sum becomes greater than the sum of remaining coins

    */
}
