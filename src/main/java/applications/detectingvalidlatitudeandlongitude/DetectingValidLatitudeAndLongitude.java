package applications.detectingvalidlatitudeandlongitude;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectingValidLatitudeAndLongitude {
    
    
    public String check(String pattern){
        
        String testString = "30\n" +
                                "(-24, -93)\n" +
                                "(-24.157721, -93.157721)\n" +
                                "(-79, -55)\n" +
                                "(-79.540667, -55.540667)\n" +
                                "(-116, -99)\n" +
                                "(-116.639280, -99.639280)\n" +
                                "(-122, -196)\n" +
                                "(-122.85186, -196.85186)\n" +
                                "(-67, -70)\n" +
                                "(-67.233682, -70.233682)\n" +
                                "(-64, -67)\n" +
                                "(-64.780557, -67.780557)\n" +
                                "(-65, -271)\n" +
                                "(-65.347042, -271.347042)\n" +
                                "(-32, -85)\n" +
                                "(-32.84880, -85.84880)\n" +
                                "(-110, -6)\n" +
                                "(-110.158590, -6.158590)\n" +
                                "(-130, -219)\n" +
                                "(-130.581178, -219.581178)\n" +
                                "(-88, -241)\n" +
                                "(-88.344600, -241.344600)\n" +
                                "(-6, -165)\n" +
                                "(-6.871826, -165.871826)\n" +
                                "(-98, -40)\n" +
                                "(-98.122626, -40.122626)\n" +
                                "(-6, -172)\n" +
                                "(-6.377934, -172.377934)\n" +
                                "(-147, -266)\n" +
                                "(-147.357525, -266.357525)";
        
        String[] testStrings = testString.split("\n");
        
        int numberOfLines = Integer.parseInt(testStrings[0].trim());
        StringBuilder sb = new StringBuilder();
        String SEPARATOR = "";
        Pattern p = Pattern.compile(pattern);
        for (int i = 1; i <= numberOfLines; i++) {
            Matcher m = p.matcher(testStrings[i]);
            sb.append(SEPARATOR);
            if (m.matches()) {
                sb.append("Valid");
            } else {
                sb.append("Invalid");
            }
            SEPARATOR = "\n";
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
