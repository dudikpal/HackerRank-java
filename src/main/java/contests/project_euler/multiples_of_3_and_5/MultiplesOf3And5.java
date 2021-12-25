package contests.project_euler.multiples_of_3_and_5;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiplesOf3And5 {

    public String solution(String input) {

        Scanner in = new Scanner(input);
        int t = in.nextInt();
        StringBuilder sb = new StringBuilder();
        String separator = "";

        for(int i = 0; i < t; i++){
            int n = in.nextInt() - 1;
            int sum = 0;
            int three = n / 3;
            int five = n / 5;
            int fifteen = n / 15;
            sum = 3 * (three * (three + 1) / 2) + 5 * (five * (five + 1) / 2) - 15 * (fifteen * (fifteen + 1) / 2);
            sb.append(separator).append(sum);
            separator = "\n";

        }
        return sb.toString();
    }
}
