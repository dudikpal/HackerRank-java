package regex.assertions.positivelookbehind;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PositiveLookbehind {
    
    public int check(String pattern){
        
        String testString = "123Go!";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        int counter = 0;
        while (m.find()) {
            counter++;
        }
        return counter;
    }
}
