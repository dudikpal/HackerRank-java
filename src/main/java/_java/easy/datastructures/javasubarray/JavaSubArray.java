package _java.easy.datastructures.javasubarray;

import java.util.ArrayList;
import java.util.List;

public class JavaSubArray {

    public int negativeSubarrayCount(String input) {
        String[] inputs = input.split("\n|\\s");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < inputs.length; i++) {
            numbers.add(Integer.parseInt(inputs[i]));
        }
        int counter = 0;
        for (int i = 0; i < numbers.size() ; i++) {
            for (int j = 0; j < numbers.size() - i; j++) {
                if (numbers.subList(i, i + j + 1).stream().mapToInt(x -> x).sum() < 0) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
