//  B. Clock Conversion

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
        String[] time = input.split(":");
        int hour = Integer.parseInt(time[0]);
        String minute = time[1];

        String period = (hour < 12) ? "AM" : "PM";

        if (hour == 0) {
            hour = 12;
        } else if (hour > 12) {
            hour -= 12;
        }

        System.out.printf("%02d:%s %s\n", hour, minute, period);
    }

    /*
    00:00 -> 12:00 AM
    01:00 -> 01:00 AM
    02:00 -> 02:00 AM
    11:59 -> 11:59 AM
    12:00 -> 12:00 PM
    14:00 -> 14 - 12 -> 02:00 PM

    obs 1: if the time is smaller than 12:00 --> same time with AM appended otherwise PM appended
    */
}
