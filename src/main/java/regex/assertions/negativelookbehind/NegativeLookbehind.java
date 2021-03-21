package regex.assertions.negativelookbehind;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NegativeLookbehind {
    
    public int check(String pattern){
        
        String testString = "1o1s";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        int counter = 0;
        while (m.find()) {
            counter++;
        }
        return counter;
    }
}
