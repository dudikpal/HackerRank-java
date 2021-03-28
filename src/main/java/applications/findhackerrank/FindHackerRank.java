package applications.findhackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindHackerRank {
    
    public String check(){
        
        String testString = "4\n" +
                                "i love hackerrank\n" +
                                "hackerrank is an awesome place for programmers\n" +
                                "hackerrank\n" +
                                "i think hackerrank is a great place to hangout";
        
        String[] testStrings = testString.split("\n");
        
        int numberOfLines = Integer.parseInt(testStrings[0].trim());
        StringBuilder sb = new StringBuilder();
        String SEPARATOR = "";
        String zeroPointPattern = "^hackerrank$";
        String onePointPattern = "^hackerrank.*";
        String twoPointsPattern = ".*hackerrank$";
        
        
        for (int i = 1; i <= numberOfLines; i++) {
            Pattern zeroPattern = Pattern.compile(zeroPointPattern);
            Matcher zeroMatches = zeroPattern.matcher(testStrings[i]);
            Pattern onePattern = Pattern.compile(onePointPattern);
            Matcher oneMatches = onePattern.matcher(testStrings[i]);
            Pattern twoPattern = Pattern.compile(twoPointsPattern);
            Matcher twoMatches = twoPattern.matcher(testStrings[i]);
            sb.append(SEPARATOR);
            if (zeroMatches.matches()) {
                sb.append("0");
            } else if (oneMatches.matches()) {
                sb.append("1");
            } else if (twoMatches.matches()) {
                sb.append("2");
            } else {
                sb.append("-1");
            }
            SEPARATOR = "\n";
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
