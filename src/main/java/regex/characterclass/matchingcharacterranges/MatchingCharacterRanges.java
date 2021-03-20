package regex.characterclass.matchingcharacterranges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingCharacterRanges {
    
    public boolean check(String pattern){
        
        //String testString = "z9$?ZWe"; true
        String testString = "a0$?ZWe";  //false
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        
        return m.matches();
        
    }
}
