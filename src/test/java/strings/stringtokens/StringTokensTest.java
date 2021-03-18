package strings.stringtokens;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTokensTest {
    
    @Test
    void solution() {
        
        String input = "He is a very very good boy, isn't he?";
        String expected = "He\n" +
                              "is\n" +
                              "a\n" +
                              "very\n" +
                              "very\n" +
                              "good\n" +
                              "boy\n" +
                              "isn\n" +
                              "t\n" +
                              "he";
        //System.out.println("a" + "      ".trim().length() + "b");
        assertEquals(expected, new StringTokens().solution(input));
        
    }
    
    
    @Test
    void testSpaces() {
        
        
        assertEquals("0", new StringTokens().solution("       "));
        
    }
}