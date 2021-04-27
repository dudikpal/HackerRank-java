package interviewpreparationkit.stringmanipulation.makinganagrams;

import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {

    public int Solution(String str1, String str2) {

        StringBuilder longer = new StringBuilder();
        StringBuilder shorter = new StringBuilder();
        int deleteCounter = 0;
        if (str1.length() > str2.length()) {
            longer.append(str1);
            shorter.append(str2);
        } else {
            longer.append(str2);
            shorter.append(str1);
        }
        for (char item: longer.toString().toCharArray()) {
            int index = shorter.indexOf(String.valueOf(item));
            if (index > -1) {
                shorter.deleteCharAt(index);
                longer.deleteCharAt(longer.indexOf(String.valueOf(item)));
            }
        }
        deleteCounter = shorter.length() + longer.length();
        return deleteCounter;
    }


}
