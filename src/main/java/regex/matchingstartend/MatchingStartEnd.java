package regex.matchingstartend;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingStartEnd {
    
    public boolean check(String pattern){
        
        String testString = "0qwer.";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        
        return m.matches();
        
    }
}
