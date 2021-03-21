package regex.repetitions.matchingzeroormorerepetitions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingZeroOrMoreRepetitions {
    
    public boolean check(String pattern){
        
        String testString = "14";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        
        return m.matches();
    }
}
