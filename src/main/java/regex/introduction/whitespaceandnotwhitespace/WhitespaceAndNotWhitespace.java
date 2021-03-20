package regex.introduction.whitespaceandnotwhitespace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WhitespaceAndNotWhitespace {
    
    
    public boolean check(String pattern){
        
        String testString = "12 11 15";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        
        return m.matches();
        
    }
}
