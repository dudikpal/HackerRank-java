package regex.repetitions.matchingxyrepetitions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingXYRepetitions {
    
    public boolean check(String pattern){
        
        String testString = "3threeormorealphabets.";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        
        return m.matches();
    }
}
