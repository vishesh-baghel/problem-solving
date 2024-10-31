//  B. Shower Line

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] happiness = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                happiness[i][j] = scanner.nextInt();
            }
        }

        List<Integer> students = Arrays.asList(0, 1, 2, 3, 4);
        int maxHappiness = 0;

        for (List<Integer> perm : getAllPermutations(students)) {
            int totalHappiness = calculateHappiness(perm, happiness);
            maxHappiness = Math.max(maxHappiness, totalHappiness);
        }

        System.out.println(maxHappiness);
    }

    private static List<List<Integer>> getAllPermutations(List<Integer> students) {
        List<List<Integer>> permutations = new ArrayList<>();
        permute(students, 0, permutations);
        return permutations;
    }

    private static void permute(List<Integer> students, int index, List<List<Integer>> permutations) {
        if (index == students.size() - 1) {
            permutations.add(new ArrayList<>(students));
            return;
        }

        for (int i = index; i < students.size(); i++) {
            Collections.swap(students, i, index);
            permute(students, index + 1, permutations);
            Collections.swap(students, i, index);
        }
    }

    private static int calculateHappiness(List<Integer> permutations, int[][] happiness) {
        int totalHappiness = 0;

        totalHappiness += happiness[permutations.get(0)][permutations.get(1)] + happiness[permutations.get(1)][permutations.get(0)];
        totalHappiness += happiness[permutations.get(1)][permutations.get(2)] + happiness[permutations.get(2)][permutations.get(1)];

        totalHappiness += 2 * (happiness[permutations.get(2)][permutations.get(3)] + happiness[permutations.get(3)][permutations.get(2)]);
        totalHappiness += 2 * (happiness[permutations.get(3)][permutations.get(4)] + happiness[permutations.get(4)][permutations.get(3)]);

        return totalHappiness;
    }
}
