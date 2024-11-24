import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        int t = Integer.parseInt(input.readLine().trim());
        List<Integer> results = new ArrayList<>();

        for (int test = 0; test < t; test++) {
            int n = Integer.parseInt(input.readLine().trim());
            int[] a = Arrays.stream(input.readLine().trim().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            results.add(maxScore(a));
        }

        for (int result : results) {
            System.out.println(result);
        }
    }

    private static int maxScore(int[] a) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : a) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        int score = 0;
        for (int count : frequency.values()) {
            score += count / 2;
        }

        return score;
    }
}
