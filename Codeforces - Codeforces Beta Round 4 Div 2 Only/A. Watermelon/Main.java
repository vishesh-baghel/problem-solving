//  A. Watermelon

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    static String readln() throws IOException {
        String line = input.readLine();
        return line;
    }

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        String input = Main.readln();

        solution(input);
    }

    public static void solution(String input) {
        int parsedInput = Integer.parseInt(input);

        if (parsedInput % 2 == 0 && parsedInput > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
