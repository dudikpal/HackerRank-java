package regex.backreferences.tofailedgroups;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToFailedGroups {
    
    public boolean check(String pattern){
        
        String testString = "12-34-56-78";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        
        return m.find();
    }
}
