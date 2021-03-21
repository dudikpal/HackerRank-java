package regex.repetitions.matchingendingitems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingEndingItems {
    
    public boolean check(String pattern){
        
        String testString = "Kites";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        
        return m.matches();
    }
}
