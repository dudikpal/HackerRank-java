package regex.characterclass.matchingspecificcharacters;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingSpecificCharacters {
    
    
    public boolean check(String pattern){
        
        String testString = "1203x.";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        
        return m.matches();
        
    }
}
