package _java.easy.strings.patternsyntaxchecker;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    
    public String solution(String input) {
    
        String[] inputStrings = input.split("\n");
        int numberOfLines = Integer.parseInt(inputStrings[0]);
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (int i = 1; i <= numberOfLines; i++) {
            try {
                Pattern p = Pattern.compile(inputStrings[i]);
                sb.append(separator);
                sb.append("Valid");
                separator = "\n";
            } catch (PatternSyntaxException pse) {
                sb.append(separator);
                sb.append("Invalid");
                separator = "\n";
            }
        }
        return sb.toString();
    }
}
