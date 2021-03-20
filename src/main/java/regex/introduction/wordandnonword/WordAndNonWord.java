package regex.introduction.wordandnonword;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordAndNonWord {
    
    public boolean check(String pattern){
        
        String testString = "www.hackerrank.com";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        
        return m.matches();
        
    }
}
