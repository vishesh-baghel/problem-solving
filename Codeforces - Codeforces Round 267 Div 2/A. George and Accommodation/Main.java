//  A. George and Accommodation

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
        int availableRooms = 0;
        for (String line : inputLines) {
            availableRooms += checkAvailableRooms(line.trim());
        }

        System.out.println(availableRooms);
    }

    public static int checkAvailableRooms(String input) {
        String[] inputs = input.split(" ");
        int occupancy = Integer.parseInt(inputs[0]);
        int space = Integer.parseInt(inputs[1]);

        int availableSpace = space - occupancy;
        if (availableSpace >= 2) {
            return 1;
        }

        return 0;
    }
}
