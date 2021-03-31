package _java.easy.strings.validusernameregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernameRegex {
    
    public String solution(String input) {
    
        String[] inputStrings = input.split("\n");
        int numberOfLines = Integer.parseInt(inputStrings[0]);
        StringBuilder sb = new StringBuilder();
        String separator = "";
        Pattern p = Pattern.compile("^[a-zA-Z]\\w{7,29}$");
        
        for (int i = 1; i <= numberOfLines; i++) {
            Matcher m = p.matcher(inputStrings[i]);
            if (m.matches()) {
                sb.append(separator);
                sb.append("Valid");
            } else {
                sb.append(separator);
                sb.append("Invalid");
                separator = "\n";
            }
        }
        return sb.toString();
    }
}
