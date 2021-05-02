package _java.medium.strings.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {


    Pattern pattern() {
        String pattern = "^((([2][5][0-5])|([2][0-4]\\d)|([01]?\\d?\\d))\\.){3}(([2][5][0-5])|([2][0-4]\\d)|([01]?\\d?\\d))$";
        Pattern p = Pattern.compile(pattern);
        return p;
    }
}
