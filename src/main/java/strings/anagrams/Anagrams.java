package strings.anagrams;

import java.util.*;

public class Anagrams {
    
    static boolean isAnagram(String a, String b) {
        // Complete the function
        java.util.List<Character> listA = new java.util.ArrayList<>();
        java.util.List<Character> listB = new java.util.ArrayList<>();
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            listA.add(a.toLowerCase().charAt(i));
            listB.add(b.toLowerCase().charAt(i));
        }
        java.util.Collections.sort(listA);
        java.util.Collections.sort(listB);
        return listA.equals(listB);
        
    }
}
