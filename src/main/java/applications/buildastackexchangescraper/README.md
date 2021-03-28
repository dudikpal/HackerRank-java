https://www.hackerrank.com/challenges/stack-exchange-scraper/problem

### HackerRank version

``` java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder input = new StringBuilder();
        while (br.ready()) {
            input.append(br.readLine());
        }
        
        StringBuilder result = new StringBuilder();
        String separator = "";
        int numberOfQuestions = input.toString().split("<h3><a href=\"/questions/").length - 1;
        for (int i = 0; i < numberOfQuestions; i++) {
            result.append(separator);
            result.append(createResultLine(input));
            separator = "\n";
        }
        System.out.println(result.toString());
        
    }
    
    
    public static String createResultLine(StringBuilder input) {
        String searchQuestionId = "<h3><a href=\"/questions/";
        int questionIdIndex = input.indexOf(searchQuestionId) + searchQuestionId.length();
        String questionId = input.substring(questionIdIndex, input.indexOf("/", questionIdIndex)).trim();
        //input.delete(0, questionIdIndex + searchQuestionId.length());
        String searchQuestionText = "question-hyperlink\">";
        int questionTextIndex = input.indexOf(searchQuestionText, questionIdIndex) + searchQuestionText.length();
        String questionText = input.substring(questionTextIndex, input.indexOf("</a>", questionTextIndex)).trim();
        //input.delete(0, questionTextIndex + searchQuestionText.length() + questionText.length());
        String searchQuestionTime = "relativetime\">";
        int searchQuestionTimeIndex = input.indexOf(searchQuestionTime, questionTextIndex) + searchQuestionTime.length();
        String questionTime = input.substring(searchQuestionTimeIndex, input.indexOf("</span", searchQuestionTimeIndex)).trim();
        input.delete(0, searchQuestionTimeIndex);
        return questionId + ";" + questionText + ";" + questionTime;
    }
        
    
}
```