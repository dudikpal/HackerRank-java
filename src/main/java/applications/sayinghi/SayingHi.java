package applications.sayinghi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SayingHi {
    
    public String check(String pattern){
        
        String testString = "7\n" +
                                "bottom\n" +
                                "dominate weekly cancer challenge prisoner pollution clear\n" +
                                "grandmother\n" +
                                "closely pronounce make sick statement folding collection yes place\n" +
                                "lawyer fire language\n" +
                                "Hi penny blankly breath accuse successfully division\n" +
                                "Hi gamble give move previously annoyed";
        
        String[] testStrings = testString.split("\n");
        
        int numberOfLines = Integer.parseInt(testStrings[0].trim());
        StringBuilder sb = new StringBuilder();
        String SEPARATOR = "";
        Pattern p = Pattern.compile(pattern);
        for (int i = 1; i <= numberOfLines; i++) {
            Matcher m = p.matcher(testStrings[i]);
            if (m.matches()) {
                sb.append(SEPARATOR);
                sb.append(testStrings[i]);
                SEPARATOR = "\n";
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
