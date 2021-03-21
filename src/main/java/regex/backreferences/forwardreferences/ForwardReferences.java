package regex.backreferences.forwardreferences;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ForwardReferences {
    
    public boolean check(String pattern){
        
        String testString = "tactactic";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        
        return m.find();
    }
}
