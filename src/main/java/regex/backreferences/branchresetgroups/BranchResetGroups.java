package regex.backreferences.branchresetgroups;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BranchResetGroups {
    
    public boolean check(String pattern){
        
        String testString = "12-34-56-78---10";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        
        return m.find();
    }
}
