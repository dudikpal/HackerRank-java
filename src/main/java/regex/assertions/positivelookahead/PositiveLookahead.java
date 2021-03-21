package regex.assertions.positivelookahead;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PositiveLookahead {
    
    public int check(String pattern){
        
        String testString = "gooooo!";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        int counter = 0;
        while (m.find()) {
            counter++;
        }
        return counter;
    }
}
