package regex.groupingandcapturing.capturingandnoncapturinggroups;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapturingAndNonCapturingGroups {
    
    public boolean check(String pattern){
        
        String testString = "okokok! cya";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        
        return m.find();
    }
}
