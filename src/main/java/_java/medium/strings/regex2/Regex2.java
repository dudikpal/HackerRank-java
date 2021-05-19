package _java.medium.strings.regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

    // alakul, de a goodbye - bye is kiválasztja
    // ((?=.+?)(\w+))+\s\1
    // már csak az in - into maradt
    // (\b(?=.+?)(\w+)\b)\s\1
    public String solution(String input) {
        Pattern p = Pattern.compile("(?i)\\b(\\w+)(?:\\W+\\1\\b)+");
        Matcher m = p.matcher(input);
        while (m.find()) {
            input = input.replaceAll(m.group(), m.group(1));
        }
        return input;
    }
}
