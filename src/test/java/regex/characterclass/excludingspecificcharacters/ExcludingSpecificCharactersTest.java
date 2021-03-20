package regex.characterclass.excludingspecificcharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcludingSpecificCharactersTest {
    
    @Test
    void check() {
        
        assertTrue(new ExcludingSpecificCharacters().check("^\\D[^aeiou][^bcDF]\\S[^AEIOU][^\\.,]$"));
        
    }
}