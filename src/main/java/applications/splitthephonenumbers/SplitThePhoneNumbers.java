package applications.splitthephonenumbers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitThePhoneNumbers {
    
    public String check(String pattern){
        
        String testString = "2\n" +
                                "1 877 2638277\n" +
                                "91-011-23413627";
        
        String[] phoneNumbers = testString.split("\n");
        
        int numberOfLines = Integer.parseInt(phoneNumbers[0].trim());
        StringBuilder sb = new StringBuilder();
        String SEPARATOR = "";
        Pattern p = Pattern.compile(pattern);
        
        for (int i = 1; i <= numberOfLines; i++) {
            Matcher m = p.matcher(phoneNumbers[i]);
            sb.append(SEPARATOR);
            if (m.matches()) {
                String[] parts = phoneNumbers[i].split("-|\\s");
                sb.append("CountryCode=" + parts[0] + ",LocalAreaCode=" + parts[1] + ",Number=" + parts[2]);
            }
            SEPARATOR = "\n";
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
