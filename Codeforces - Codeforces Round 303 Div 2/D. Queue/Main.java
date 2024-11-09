//  D. Queue

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
        for (int i = 0; i < inputLines.size() - 1; i++) {
            printSolution(inputLines.get(i), inputLines.get(i + 1));
        }
    }

    public static void printSolution(String input1, String input2) {
        List<Integer> servingTimes = Arrays.stream(input2.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        Collections.sort(servingTimes);
        int happyPersons = 0;
        int sum = 0;

        for (int i = 0; i < servingTimes.size(); i++) {
            if (sum <= servingTimes.get(i)) {
                happyPersons++;
                sum += servingTimes.get(i);
            }
        }

        System.out.println(happyPersons);
    }

    /*
    constraints
    1. the disappointment is the total sum of all the persons serving time before a person in observation

    objective: find the maximum number of not disappointed persons

    observations:
    1. we have to always sort the list to get the desired placement of persons
    2. first person is always not disappointed

    logic:
    1. sort the list of persons in ascending order
    2. if the sum of serving time for a person is less than or equal to the previous persons, then
        increment the count of not disappointed persons

    13 2 5 55 21 34 1 8 1 3

    */
}
