package regex.repetitions.matchingoneormorerepetitions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingOneOrMoreRepetitions {
    
    public boolean check(String pattern){
        
        String testString = "1Qa";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        
        return m.matches();
    }
}
