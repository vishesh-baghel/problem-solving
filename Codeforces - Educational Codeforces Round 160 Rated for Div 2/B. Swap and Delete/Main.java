//  B. Swap and Delete

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.Collectors;

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
        for (int i = 1; i < inputLines.size(); i++) {
            printSolution(inputLines.get(i));
        }
    }

    public static void printSolution(String input) {
        int zeroCount = 0;
        int oneCount = 0;

        for (char ch : input.toCharArray()) {
            if (ch == '0') {
                zeroCount++;
            } else {
                oneCount++;
            }
        }

        int goodStringLength = 0;
        for (char ch : input.toCharArray()) {
            if (ch == '0') {
                if (oneCount > 0) {
                    goodStringLength++;
                    oneCount--;
                } else {
                    break;
                }
            }

            if (ch == '1') {
                if (zeroCount > 0) {
                    goodStringLength++;
                    zeroCount--;
                } else {
                    break;
                }
            }
        }

        System.out.println(input.length() - goodStringLength);
    }

    /*
    conditions:
    1. the input string only contains 0 and 1
    2. only two types of operations are possible
        a. delete any 1 character which costs 1 coin
        b. swap any two characters in the input string which costs 0 coins
    3. no limit on number of operations in any order
    4. a good string is either empty or it doesn't match with the original string at all.

    objective: minimum total cost to make the input string good.

    observations:
    1. for all single character strings, the answer is always 1 due to delete operation done once.
    2. I need to add the costs of number of operations done on the input string.
    3. we will get the minimum cost by swapping the elements and then comparing them with the original string
       since, swap is free of cost. so always to swaps first.
    4. swap only 0 with 1 and vice versa.

    logic:
    1.

    input: 011
    delete 1 at index 2: 01, 1 coin spent
    swap the string: 10, 0 coin spent
    s and t doesn't match
    answer: 1 + 0 = 1

    input: 111100
    swap1: 001111
    delete1: 00111
    delete2: 0011
    delete3: 001
    delete4: 00
    00 != 111100
    no. of operations: 0 + 1 + 1 + 1 + 1 = 4

    input: 0101110001
    sort: 0000011111
    swap: 1010101010

    */
}
