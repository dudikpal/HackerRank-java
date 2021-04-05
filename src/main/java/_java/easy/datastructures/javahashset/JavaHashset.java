package _java.easy.datastructures.javahashset;

import java.util.HashSet;

public class JavaHashset {
    
    public String solution(String input) {
    
        String[] inputs = input.split("\n");
        HashSet<String> pairs = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (int i = 1; i < inputs.length; i++) {
            pairs.add(inputs[i]);
            sb.append(separator).append(pairs.size());
            separator = "\n";
        }
        return sb.toString();
    }
}
