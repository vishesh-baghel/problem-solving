//  A. Soldier and Bananas 546A

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
        for (String line : inputLines) {
            printSolution(line.trim());
        }
    }

    public static void printSolution(String input) {
        String[] inputs = input.split(" ");
        int costOfOneBanana = Integer.parseInt(inputs[0]);
        int initialDollars = Integer.parseInt(inputs[1]);
        int numberOfBananaToBuy = Integer.parseInt(inputs[2]);

        int numberOfBananaBought = 1;
        int totalCostOfBananas = 0;
        while (numberOfBananaBought <= numberOfBananaToBuy) {
            totalCostOfBananas += costOfOneBanana * numberOfBananaBought;
            numberOfBananaBought++;
        }

        int moneyToBorrow = totalCostOfBananas - initialDollars;

        if (moneyToBorrow < 0) {
            System.out.println("0");
        } else {
            System.out.println(moneyToBorrow);
        }
    }

    /*
    first input --> cost of 1st banana(3)
    second input --> initial dollars(17)
    third input --> number of bananas to buy(4)

    test case 1:
    1*3 + 2*3 + 3*3 + 4*3= 3 + 6 + 9 + 12 = 30
    money to borrow = 30 - initial dollors(17) = 13
     */
}
