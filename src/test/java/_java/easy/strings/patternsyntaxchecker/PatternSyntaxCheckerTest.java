package _java.easy.strings.patternsyntaxchecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PatternSyntaxCheckerTest {
    
    @Test
    void test() {
        
        String input = "3\n" +
                           "([A-Z])(.+)\n" +
                           "[AZ[a-z](a-z)\n" +
                           "batcatpat(nat";
        
        String expected = "Valid\n" +
                              "Invalid\n" +
                              "Invalid";
        
        assertEquals(expected, new PatternSyntaxChecker().solution(input));
        
    }
}