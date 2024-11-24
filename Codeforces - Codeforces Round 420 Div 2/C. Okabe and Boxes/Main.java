//  C. Okabe and Boxes

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        Stack<Integer> boxes = new Stack<>();
        int expected = 1;
        int reorderCount = 0;

        for (int i = 0; i < n * 2; i++) {
            String[] inputs = bufferedReader.readLine().split(" ");
            String command = inputs[0];

            if (command.equals("add")) {
                boxes.push(Integer.parseInt(inputs[1]));
            } else {
                if (!boxes.isEmpty() && boxes.peek() == expected) {
                    boxes.pop();
                } else if (!boxes.isEmpty()){
                    reorderCount++;
                    boxes.clear();
                }
                expected++;
            }
        }

        System.out.println(reorderCount);
    }

    /*
    constraints:


    objective: to find the number of reorders that need to happen in order to remove the boxes from stac

    observations:
    we can reorder all the previously added boxes.

    logic:
    
    */
}
