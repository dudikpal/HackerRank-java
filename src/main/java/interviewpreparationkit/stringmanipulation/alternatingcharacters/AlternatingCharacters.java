package interviewpreparationkit.stringmanipulation.alternatingcharacters;

import java.util.Arrays;

public class AlternatingCharacters {

    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternatingCharacters(String s) {
        // Write your code here
        int deleteCounter = 0;
        String[] sequences = s.split("(?=([AB]))");

        for (int i = 0; i < sequences.length - 1; i++) {
            if (sequences[i].equals(sequences[i + 1])) {
                deleteCounter++;
            }
        }
        return deleteCounter;
    }

}
