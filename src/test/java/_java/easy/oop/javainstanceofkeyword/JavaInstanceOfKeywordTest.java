package _java.easy.oop.javainstanceofkeyword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaInstanceOfKeywordTest {
    
    @Test
    void solution() {
        
        String input = "5\n" +
                           "Student\n" +
                           "Student\n" +
                           "Rockstar\n" +
                           "Student\n" +
                           "Hacker";
        
        String expected = "3 1 1";
        
        assertEquals(expected, new JavaInstanceOfKeyword().solution(input));
    }
}