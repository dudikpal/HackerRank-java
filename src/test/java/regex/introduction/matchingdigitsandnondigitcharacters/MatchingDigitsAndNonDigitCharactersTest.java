package regex.introduction.matchingdigitsandnondigitcharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingDigitsAndNonDigitCharactersTest {
    
    @Test
    void check() {
        
        assertEquals(true, new MatchingDigitsAndNonDigitCharacters().check("(\\d\\d\\D){2}\\d{4}"));
        
    }
}