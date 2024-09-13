//  A. Team / 231A

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
        int willAttemptQuestion = 0;
        int numberOfQuestions = Integer.parseInt(inputLines.remove(0));

        for (String agreement: inputLines) {
            agreement.trim();
            String[] choices = agreement.split(" ");

            int numberOfYes = 0;
            for (String choice : choices) {
                if (choice.equalsIgnoreCase("1")) {
                    numberOfYes++;
                }
            }

            if (numberOfYes >= 2) {
                willAttemptQuestion++;
            }
        }

        if (willAttemptQuestion <= numberOfQuestions) {
            System.out.println(willAttemptQuestion);
        }
    }
}
