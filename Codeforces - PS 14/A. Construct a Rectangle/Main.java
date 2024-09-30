//  A. Construct a Rectangle

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
        inputLines.remove(0);
        for (String line : inputLines) {
            printSolution(line.trim());
        }
    }

    public static void printSolution(String input) {
        List<Integer> sticks = Arrays.asList(input.split(" "))
                .stream().map(Integer::parseInt)
                .collect(Collectors.toList());

        int first = sticks.get(0);
        int second = sticks.get(1);
        int third = sticks.get(2);

        if (first == second) {
            int firstPiece = third / 2;
            int secondPiece = third - firstPiece;
            if (firstPiece == secondPiece) {
                System.out.println("YES");
                return;
            }
        }

        if (second == third) {
            int firstPiece = first / 2;
            int secondPiece = first - firstPiece;
            if (firstPiece == secondPiece) {
                System.out.println("YES");
                return;
            }
        }

        if (first == third) {
            int firstPiece = second / 2;
            int secondPiece = second - firstPiece;
            if (firstPiece == secondPiece) {
                System.out.println("YES");
                return;
            }
        }

        if (first != second && second != third && third != first) {
            Collections.sort(sticks);

            int smallest = sticks.get(0); // 1
            int middle = sticks.get(1); // 5
            int largest = sticks.get(2); // 6

            int firstPiece = largest - smallest; // 5
            int secondPiece = largest - firstPiece; // 1

            if (smallest == secondPiece && middle == firstPiece) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }

    /*
    conditions:
    1. break only 1 stick of positive length
    2. only break stick into two pieces
    2. square is also rectangle
    3. it is possible to break the stick equally

    objective: print yes if the sticks can form a rectangle otherwise no

    logic:
    1. if two sticks have equal length then break the third stick equally
    2. substract smallest stick from largest stick and see if it's possible to get a rectangle


    */
}
