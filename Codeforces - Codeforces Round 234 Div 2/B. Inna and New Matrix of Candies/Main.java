//  B. Inna and New Matrix of Candies

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
        Set<Integer> distances = new HashSet<>();
        for (int i = 1; i < inputLines.size(); i++) {
            String[] line = inputLines.get(i).split("");
            int distanceOfS = 0;
            int distanceOfG = 0;

            for (int j = line.length - 1; j >= 0; j--) {
                if (line[j].equals("S")) {
                    break;
                }
                distanceOfS++;
            }

            for (int j = line.length - 1; j >= 0; j--) {
                if (line[j].equals("G")) {
                    break;
                }
                distanceOfG++;
            }

            if ((distanceOfG - distanceOfS) < 0) {
                System.out.println("-1");
                return;
            }

            distances.add(distanceOfG - distanceOfS);
        }

        System.out.println(distances.size());
    }
}
