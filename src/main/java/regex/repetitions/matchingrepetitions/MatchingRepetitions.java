package regex.repetitions.matchingrepetitions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingRepetitions {
    
    public boolean check(String pattern){
        
        String testString = "x4202v2A22A9a6aaaaaa2G2222m222qwertyYuIo13957";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        
        return m.matches();
    }
}
