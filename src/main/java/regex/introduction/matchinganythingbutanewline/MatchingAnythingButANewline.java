package regex.introduction.matchinganythingbutanewline;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingAnythingButANewline {
    
    
    public boolean check(String pattern){
        
        String testString = "123.456.abc.def";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        
        return m.matches();
        
    }
}
