package applications.hackerranktweets;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankTweets {
    
    public int check(String pattern){
        
        String testString = "4\n" +
                                "I love #hackerrank\n" +
                                "I just scored 27 points in the Picking Cards challenge on #HackerRank\n" +
                                "I just signed up for summer cup @hackerrank\n" +
                                "interesting talk by hari, co-founder of hackerrank";
        
        String[] testStrings = testString.split("\n");
        
        int numberOfLines = Integer.parseInt(testStrings[0].trim());
        Pattern p = Pattern.compile(pattern);
        int counter = 0;
        for (int i = 1; i <= numberOfLines; i++) {
            Matcher m = p.matcher(testStrings[i]);
            if (m.find()) {
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }
}
