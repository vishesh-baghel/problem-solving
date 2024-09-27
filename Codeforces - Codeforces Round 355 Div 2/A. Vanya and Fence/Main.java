//  A. Vanya and Fence

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
        int fenceHeight = Integer.parseInt(inputLines.get(0).split(" ")[1]);
        String[] heights = inputLines.get(1).split(" ");

        int roadWidth = 0;
        for (String height : heights) {
            if (Integer.parseInt(height) > fenceHeight) {
                roadWidth += 2;
            } else {
                roadWidth += 1;
            }
        }

        System.out.println(roadWidth);
    }

    /*
    conditions:
    1. the person should only bend if the height is strictly greater than the fence

    logic:
    iterate on the array of heights are calculate the width of the road by taking the sum of
    each persons width

    */
}
