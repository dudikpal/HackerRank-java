package regex.characterclass.matchingspecificcharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingSpecificCharactersTest {
    
    @Test
    void check() {
        
        assertTrue(new MatchingSpecificCharacters().check("^[123][120][xs0][30aA][xsu][.,]$"));
        
    }
}