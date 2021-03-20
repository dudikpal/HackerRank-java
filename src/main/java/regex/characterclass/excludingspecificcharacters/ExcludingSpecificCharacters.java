package regex.characterclass.excludingspecificcharacters;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExcludingSpecificCharacters {
    
    public boolean check(String pattern){
        
        String testString = "think?";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        
        return m.matches();
        
    }
}
