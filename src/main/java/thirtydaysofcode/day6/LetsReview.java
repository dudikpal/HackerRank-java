package thirtydaysofcode.day6;

import java.util.Scanner;

public class LetsReview {

    public String solution(String input) {

        StringBuilder sbEven = new StringBuilder();
        StringBuilder sbOdd = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                sbEven.append(input.charAt(i));
            } else {
                sbOdd.append(input.charAt(i));
            }
        }
        sbEven.append(" ");
        return sbEven.toString() + sbOdd.toString();
    }
}
