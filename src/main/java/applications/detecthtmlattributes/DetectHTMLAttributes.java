package applications.detecthtmlattributes;

import java.util.*;
import java.util.regex.*;

public class DetectHTMLAttributes {
    
    public String check(String input){
        
        
        String regex = "<(\\w+)([^>]*)>";
        String regexAttr = "\\s+(\\w+)=";
        
        Pattern p = Pattern.compile(regex);
        Pattern p2 = Pattern.compile(regexAttr);
        
        Map<String, Set<String>> map = new TreeMap();
        String[] testStrings = input.split("\n");
        int numberOfLines = Integer.parseInt(testStrings[0].trim());
        
        for (int i = 1; i < numberOfLines; i++) {
            String line = testStrings[i];
            
            Matcher m = p.matcher(line);
            
            while (m.find()) {
                
                String tag = m.group(1);
                
                Set<String> set = map.get(tag);
                if (set == null) {
                    set = new TreeSet();
                    map.put(tag, set);
                }
                
                String attrs = m.group(2);
                Matcher m2 = p2.matcher(attrs);
                while (m2.find()) {
                    String attr = m2.group(1);
                    set.add(attr);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (String tag : map.keySet()) {
            
            Set<String> attrs = map.get(tag);
    
            String output = null;
            
            output = tag + ":" +
                         attrs.toString().replaceAll("\\[|\\]","").replace(" ", "");
            
            sb.append(separator);
            sb.append(output);
            separator = "\n";
            
        }
        return sb.toString();
    }
}


/*
package applications.detecthtmlattributes;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHTMLAttributes {
    
    public String check(String input){
        
        String[] testStrings = input.split("\n");
        
        int numberOfLines = Integer.parseInt(testStrings[0].trim());
        Map<String, String> attributes = new HashMap<>();
        Pattern expressionFinder = Pattern.compile("<[^/].*?>");
        Pattern tagFinder = Pattern.compile("<\\w+");
        Pattern attributeFinder = Pattern.compile("\\s(\\w)+=");
        for (int i = 1; i <= numberOfLines; i++) {
            Matcher expressionMatcher = expressionFinder.matcher(testStrings[i]);
            while (expressionMatcher.find()) {
                */
/*attributes.put(tagMatcher.group(0).substring(1), "");
                while (attributeMatcher.find()) {
                    //attributes.put(tagMatcher.group(0), attributeMatcher.group(0).substring(0, attributeMatcher.group(0).length() - 1));
                    attributes.merge(tagMatcher.group(0), attributeMatcher.group(0).substring(0, attributeMatcher.group(0).length() - 1), (prev, act) -> prev.join(",", act));
                }*//*

                String expression = expressionMatcher.group();
                Matcher tagMatcher = tagFinder.matcher(expression);
                StringBuilder sb = new StringBuilder();
                if (tagMatcher.find()) {
                    String key = tagMatcher.group().substring(1);
                    Matcher attributeMatcher = attributeFinder.matcher(expression);
                    String SEPARATOR = "";
                    while (attributeMatcher.find()) {
                        sb.append(SEPARATOR);
                        String attribute = attributeMatcher.group().substring(0, attributeMatcher.group().length() - 1);
                        sb.append(attribute);
                        SEPARATOR = ",";
                    }
                    attributes.merge(key, sb.toString(), (prev, actual) -> prev.concat(actual));
                }
                
                System.out.println(attributes);
            }
            
            
            
            
        }
        System.out.println(attributes);
        return "";
    }
}
*/
