package _java.medium.strings.tagcontentextractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    public String solution(String input) {
        Scanner sc = new Scanner(input);
        StringBuilder sb = new StringBuilder();
        Pattern p = Pattern.compile("<(.+)>.+<\\/\\1>");

        while (sc.hasNextLine()) {
            Matcher m = p.matcher(sc.nextLine());
            boolean isvalidLine = false;

            while (m.find()) {
                isvalidLine = true;
                String validLine = m.group();
                validLine = validLine.replaceAll("<\\/?[\\w\\s]+>", "");
                sb.append(validLine).append("\n");
            }

            if (!isvalidLine) {
                sb.append("None\n");
            }
        }
        return sb.toString().trim();
    }
}
