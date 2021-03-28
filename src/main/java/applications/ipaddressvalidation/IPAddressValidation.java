package applications.ipaddressvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddressValidation {
    
    public String check(){
        
        String testString = "8\n" +
                                "1.56.48.79\n" +
                                "19.65.123.135\n" +
                                "215.265.200.1\n" +
                                "265.197.5.45\n" +
                                "2001:0db8:0000:0000:0000:ff00:0042:8329\n" +
                                "2001:db8:0:00:00000:ff00:42:832\n" +
                                "2001:gdb8:0000:0000:0000:ff00:042:8329\n" +
                                "2001:0db8:0:0:0:ff00:42:8329";
        
        String[] testStrings = testString.split("\n");
        
        int numberOfLines = Integer.parseInt(testStrings[0].trim());
        //Pattern ipv4Pattern = Pattern.compile("^(\\b(\\d|\\d\\d|[12][0-5]{2})\\.){3}(\\d|\\d\\d|[1-2][0-5]{2})$");
        //Pattern ipv4Pattern = Pattern.compile("^(\\b(\\d|\\d\\d|[12][0-5]{2})\\.)+([12]\\d+)$");
        Pattern ipv4Pattern = Pattern.compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
        Pattern ipv6Pattern = Pattern.compile("^(([a-f]|\\d){1,4}:?){8}$");
        Matcher m;
        StringBuilder sb = new StringBuilder();
        String separator = "";
        boolean isIPAddress = false;
        for (int i = 1; i <= numberOfLines; i++) {
            m = ipv4Pattern.matcher(testStrings[i]);
            if (m.matches()) {
                sb.append(separator);
                sb.append("IPv4");
                isIPAddress = true;
            }
            m = ipv6Pattern.matcher(testStrings[i]);
            if (m.matches()) {
                sb.append(separator);
                sb.append("IPv6");
                isIPAddress = true;
            }
            if (!isIPAddress) {
                sb.append(separator);
                sb.append("Neither");
            }
            isIPAddress = false;
            separator = "\n";
        }
        
        System.out.println(sb.toString());
        return sb.toString();
    }
    
}
