package _java.easy.datastructures.javalist;

import java.util.LinkedList;

public class JavaList {
    
    public String solution(String input) {
    
        String[] inputs = input.split("\n");
        LinkedList<String> numbers = new LinkedList<>();
        String[] numberArr = inputs[1].split("\\s");
        for (String number : numberArr) {
            numbers.add(number);
        }
        
        for (int i = 3; i < inputs.length; i += 2) {
            String[] query =  inputs[i + 1].split("\\s");
            int index = Integer.parseInt(query[0]);
            if (inputs[i].equals("Insert")) {
                String value = query[1];
                numbers.add(index, value);
            } else {
                numbers.remove(index);
            }
        }
        return numbers.toString().replace(",", "").replace("[", "").replace("]", "");
    }
    
}
