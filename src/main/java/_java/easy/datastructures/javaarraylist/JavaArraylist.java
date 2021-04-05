package _java.easy.datastructures.javaarraylist;

import java.util.ArrayList;
import java.util.List;

public class JavaArraylist {
    
    public String solution(String input) {
        
        String[] inputs = input.split("\n");
        int rowOfNumbers = Integer.parseInt(inputs[0]);
        List<String> lines = new ArrayList<>();
        List<String> queries = new ArrayList<>();
        
        for (int i = 1; i < inputs.length; i++) {
            if (i <= rowOfNumbers) {
                lines.add(inputs[i]);
            }
            if (i > rowOfNumbers + 1) {
                queries.add(inputs[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        String separator = "";
        
        for (String query : queries) {
            sb.append(separator);
            int row = Integer.parseInt(query.split("\\s")[0]) - 1;
            int column = Integer.parseInt(query.split("\\s")[1]);
            if (lines.get(Integer.parseInt(query.split("\\s")[0]) - 1).split("\\s").length < 2
                || lines.get(row).split("\\s").length <= column) {
                sb.append("ERROR!");
            } else {
                sb.append(lines.get(row).split("\\s")[column]);
            }
            separator = "\n";
        }
        return sb.toString();
    }
}
