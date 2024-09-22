//  A. Anton and Danik

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
        inputLines.remove(0);
        for (String line : inputLines) {
            printSolution(line.trim());
        }
    }

    public static void printSolution(String input) {
        String[] letters = input.split("");
        int antonWins = 0;
        int danikWins = 0;

        for (String letter : letters) {
            if (letter.equals("A")) antonWins++;
            if (letter.equals("D")) danikWins++;
        }

        if (antonWins == danikWins) {
            System.out.println("Friendship");
        } else if (antonWins > danikWins) {
            System.out.println("Anton");
        } else {
            System.out.println("Danik");
        }
    }

    /*
    print Anton if number of A's in the input string is greater, otherwise Danik
    I can break the string into char array but the constraints are too big and time limit can exceed.


    */
}
