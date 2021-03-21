package regex.groupingandcapturing.matchingwordboundaries;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingWordBoundaries {
    
    public boolean check(String pattern){
        
        String testString = "Found any match?";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        
        return m.find();
    }
}
