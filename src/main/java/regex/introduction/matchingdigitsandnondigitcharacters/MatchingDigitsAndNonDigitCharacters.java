package regex.introduction.matchingdigitsandnondigitcharacters;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingDigitsAndNonDigitCharacters {
    
    
    
    public boolean check(String pattern){
        
        String testString = "06-11-2015";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        
        return m.matches();
        
    }
}
