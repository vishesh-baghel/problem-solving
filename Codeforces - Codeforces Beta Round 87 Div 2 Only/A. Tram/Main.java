//  A. Tram

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
        int numberOfStops = Integer.parseInt(inputLines.get(0));

        int capacity = 0;
        int currentCapacity = 0;

        for (int i = 1; i < inputLines.size(); i++) {
            String[] passengers = inputLines.get(i).split(" ");
            int departingPassengers = Integer.parseInt(passengers[0]);
            int arrivingPassengers = Integer.parseInt(passengers[1]);

            currentCapacity -= departingPassengers;
            currentCapacity += arrivingPassengers;

            if (currentCapacity >= capacity) {
                capacity = currentCapacity;
            }
        }

        System.out.println(capacity);
    }

    /*
    conditions:
    1. at the first stop, tram always arrives empty
    2. at the last stop, tram always departs empty
    3. first value in `0 3` signifies leaving passengers and second value signifies arriving passenger

    objective: minimum capacity of the tram

    logic:
    1. minimum capacity would be the maximum number of passengers at any moment
    2. iterate on the stops and update the capacity if a bigger value comes on reaching the next stop
    3. always add the second value and substract the first value

    */
}
