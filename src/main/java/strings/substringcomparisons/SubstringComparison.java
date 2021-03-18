package strings.substringcomparisons;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubstringComparison {
    
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        /*SortedSet<String> substrings = new TreeSet<>();
        for (int i = 0; i < s.length() - k + 1; i++) {
            substrings.add(s.substring(i, i + k));
        }
        
        smallest = substrings.first();
        largest = substrings.last();*/
        
        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        String actual;
        for (int i = 0; i < s.length() - k + 1; i++) {
             actual = s.substring(i, i + k);
            if (actual.compareTo(smallest) < 0) {
                smallest = actual;
            }
            if (actual.compareTo(largest) > 0) {
                largest = actual;
            }
        }
        
        return smallest + "\n" + largest;
    }
}
