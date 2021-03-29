package applications.validpanformat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPanFormat {
    
    public String check(String pattern){
        
        String testString = "3\n" +
                                "ABCDS1234Y\n" +
                                "ABAB12345Y\n" +
                                "avCDS1234Y";
        
        String[] testStrings = testString.split("\n");
        
        int numberOfLines = Integer.parseInt(testStrings[0].trim());
        StringBuilder sb = new StringBuilder();
        String SEPARATOR = "";
        Pattern p = Pattern.compile(pattern);
        for (int i = 1; i <= numberOfLines; i++) {
            Matcher m = p.matcher(testStrings[i]);
            sb.append(SEPARATOR);
            if (m.matches()) {
                sb.append("YES");
            } else {
                sb.append("NO");
            }
            SEPARATOR = "\n";
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
