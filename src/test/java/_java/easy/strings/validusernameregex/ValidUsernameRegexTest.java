package _java.easy.strings.validusernameregex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidUsernameRegexTest {
    
    @Test
    void solution() {
        
        String input = "8\n" +
                           "Julia\n" +
                           "Samantha\n" +
                           "Samantha_21\n" +
                           "1Samantha\n" +
                           "Samantha?10_2A\n" +
                           "JuliaZ007\n" +
                           "Julia@007\n" +
                           "_Julia007";
        
        String expected = "Invalid\n" +
                              "Valid\n" +
                              "Valid\n" +
                              "Invalid\n" +
                              "Invalid\n" +
                              "Valid\n" +
                              "Invalid\n" +
                              "Invalid";
        
        assertEquals(expected, new ValidUsernameRegex().solution(input));
    }
}