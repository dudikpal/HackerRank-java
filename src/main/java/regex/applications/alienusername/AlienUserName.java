package regex.applications.alienusername;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlienUserName {
    
    public String check(String pattern){
        
        String testString = "3\n" +
                                "_0898989811abced_\n" +
                                "_abce\n" +
                                "_09090909abcD0";
        
        String[] testStrings = testString.split("\n");
        
        int numberOfLines = Integer.parseInt(testStrings[0].trim());
        StringBuilder sb = new StringBuilder();
        String SEPARATOR = "";
        Pattern p = Pattern.compile(pattern);
        for (int i = 1; i <= numberOfLines; i++) {
            Matcher m = p.matcher(testStrings[i]);
            sb.append(SEPARATOR);
            if (m.matches()) {
                sb.append("VALID");
            } else {
                sb.append("INVALID");
            }
            SEPARATOR = "\n";
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
    
}
