package applications.detecthtmltags;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHTMLTags {
    
    public String check(String pattern){
        
        String testString = "2\n" +
                                "<p><a href=\"http://www.quackit.com/html/tutorial/html_links.cfm\">Example Link</a></p>\n" +
                                "<div class=\"more-info\"><a href=\"http://www.quackit.com/html/examples/html_links_examples.cfm\">More Link Examples...</a></div>";
        String[] testStrings = testString.split("\n");
        
        
        String findedTags = "";
        int timeToProcess = Integer.parseInt(testStrings[0].trim());
        SortedSet<String> uniqueTags = new TreeSet<>();
        for (int i = 1; i < testStrings.length; i++) {
            findedTags += htmlTagsExtractor(pattern ,testStrings[i]);
        }
        
        
        String[] tags = findedTags.split(" ");
        for (String str : tags) {
            uniqueTags.add(str.trim());
        }
        StringBuilder result = new StringBuilder();
        String SEPARATOR = "";
        for (String tag : uniqueTags) {
            result.append(SEPARATOR);
            result.append(tag);
            SEPARATOR = ";";
        }
        System.out.println(result.toString());
        return result.toString();
    }
    
    
    private String htmlTagsExtractor(String pattern, String testString) {
        String result = "";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        while (m.find()) {
            result += m.toMatchResult().group().trim() + " ";
        }
        return result;
    }
}
