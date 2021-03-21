package regex.groupingandcapturing.alternativematching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlternativeMaching {
    
    public boolean check(String pattern){
        
        String testString = "Mr.VKDoshi.";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        
        return m.find();
    }
}
