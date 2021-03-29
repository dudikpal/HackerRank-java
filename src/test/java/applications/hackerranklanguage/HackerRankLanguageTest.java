package applications.hackerranklanguage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HackerRankLanguageTest {
    
    @Test
    void check() {
        
        String expected = "VALID\n" +
                              "INVALID\n" +
                              "VALID\n" +
                              "INVALID\n" +
                              "VALID\n" +
                              "INVALID\n" +
                              "VALID\n" +
                              "INVALID\n" +
                              "INVALID\n" +
                              "INVALID\n" +
                              "INVALID\n" +
                              "INVALID\n" +
                              "VALID\n" +
                              "VALID\n" +
                              "VALID\n" +
                              "VALID\n" +
                              "VALID\n" +
                              "INVALID\n" +
                              "VALID\n" +
                              "VALID\n" +
                              "VALID\n" +
                              "INVALID\n" +
                              "INVALID\n" +
                              "VALID\n" +
                              "INVALID\n" +
                              "VALID\n" +
                              "VALID\n" +
                              "INVALID\n" +
                              "VALID\n" +
                              "VALID\n" +
                              "VALID\n" +
                              "INVALID\n" +
                              "VALID\n" +
                              "VALID\n" +
                              "VALID\n" +
                              "VALID\n" +
                              "VALID\n" +
                              "VALID\n" +
                              "INVALID";
        
        assertEquals(expected, new HackerRankLanguage().check());
    }
}