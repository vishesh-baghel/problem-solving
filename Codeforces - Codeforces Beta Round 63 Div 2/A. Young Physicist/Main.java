//  A. Young Physicist

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
        int xSum = 0;
        int ySum = 0;
        int zSum = 0;

        for (int i = 1; i < inputLines.size(); i++) {
            String[] inputs = inputLines.get(i).split(" ");
            int x = Integer.parseInt(inputs[0]);
            int y = Integer.parseInt(inputs[1]);
            int z = Integer.parseInt(inputs[2]);

            xSum += x;
            ySum += y;
            zSum += z;
        }

        if (xSum == 0 && ySum == 0 && zSum == 0) {

            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
