//  A. Bus to Pénjamo

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
        int inputLength = Integer.parseInt(inputLines.get(0)) * 2;
        for (int i = 1; i < inputLength; i = i + 2) {
            printSolution(inputLines.get(i), inputLines.get(i + 1));
        }
    }

    public static void printSolution(String familyAndRows, String familyList) {
        String[] inputs = familyAndRows.split(" ");
        int numberOfFamilies = Integer.parseInt(inputs[0]);
        int rows = Integer.parseInt(inputs[1]);

        List<Integer> familyMembers = Arrays.stream(familyList.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.reverse(familyMembers);

        List<Integer> bus = Arrays.asList(new Integer[rows]);
        for (int i = 0; i < numberOfFamilies; i++) {
                    
        }
    }

    /*
    input 1: 2 3 1 => reverse sort => 3 2 1
    1. make an array of size equal to the rows
    2. if x(family members) is <= 2, and add an entry to the bus array, increment the happy counter
    3. if x > 2, substract 2 and add it to the bus array and add 1 to the next index, and then increment the happy counter

    input 4: 3 1 1 3 => 3 3 1 1
    bus: _ _ _ _ _
    1. 3 members, bus: 2 1 _ _ _, happy = 3
    2. 3 members, bus: 2 1 2 1 _, happy = 6
    3. 1 member, bus: 2 1 2 1 1, happy = 7
    4. 1 member, bus: 2 1+1 2 1 1, happy = 7 - 1 = 6

    5 * 2 = 10 seats
    pairs = 5
    10 - 3 = pairs left: 3 => 3 happy
    7 - 3 = pairs left: 1 => 6 happy
    4 - 1 = 3 seats left => 7 happy
    3 - 1 = 2 seats left => 8 happy

    6 * 2 = 12 seats
    members: 2 4 5 1 => 5 4 2 1
    12 - 5 = 7 seats left => 5 happy
    7 - 4 = 3 seats left => 9 happy
    3 - 2 = 1 seats left = 11 happy
    1 - 1 = 0 seats left = 12 happy



    */
}
