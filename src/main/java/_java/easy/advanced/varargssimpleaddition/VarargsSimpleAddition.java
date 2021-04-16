package _java.easy.advanced.varargssimpleaddition;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VarargsSimpleAddition {

    public String solution(String input) {
    
        String[] lines = input.split("\n");
        StringBuilder sb = new StringBuilder();
        String separator = "\n";
        sb.append(add(lines[0], lines[1]));
        sb.append(separator);
        sb.append(add(lines[0], lines[1], lines[2]));
        sb.append(separator);
        sb.append(add(lines[0], lines[1], lines[2], lines[3], lines[4]));
        sb.append(separator);
        sb.append(add(lines[0], lines[1], lines[2], lines[3], lines[4], lines[5]));
        return sb.toString();
    }
    
    private String add(String... numbers) {
        StringBuilder sb = new StringBuilder();
        String separator = "";
        int sum = 0;
        for (String number : numbers) {
            sb.append(separator);
            sb.append(number);
            separator = "+";
            sum += Integer.parseInt(number);
        }
        sb.append("=");
        sb.append(sum);
        return sb.toString();
    }
}
