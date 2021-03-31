package _java.easy.datastructures.java1darray;

public class Java1DArray {
    
    public String solution(String input) {
    
        String[] inputs = input.split("\n");
        int numberOfLines = Integer.parseInt(inputs[0]);
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (int i = 1; i <= numberOfLines; i++) {
            sb.append(separator);
            sb.append(inputs[i]);
            separator = "\n";
        }
        return sb.toString();
    }
}
