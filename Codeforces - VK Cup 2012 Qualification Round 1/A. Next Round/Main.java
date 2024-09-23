//  A. Next Round

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
        String[] inputs = inputLines.get(0).split(" ");
        String[] scores = inputLines.get(1).split(" ");

        int numberOfContestants = Integer.parseInt(inputs[0]);
        int minimumScorePlace = Integer.parseInt(inputs[1]);
        int minimumScore = Integer.parseInt(scores[minimumScorePlace - 1]);

        int selectedContestants = 0;
        for (String score : scores) {
            int scoreAchieved = Integer.parseInt(score);
            if (scoreAchieved >= minimumScore && scoreAchieved > 0) {
                selectedContestants++;
            }
        }

        System.out.println(selectedContestants);
    }

    /*
    two conditions:
    1. score => k'th place score
    2. positive score
    */
}
