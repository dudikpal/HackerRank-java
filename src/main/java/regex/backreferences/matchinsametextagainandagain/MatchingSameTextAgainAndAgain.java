package regex.backreferences.matchinsametextagainandagain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingSameTextAgainAndAgain {
    
    public boolean check(String pattern){
        
        String testString = "ab #1?AZa$ab #1?AZa$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        
        return m.find();
    }
}
