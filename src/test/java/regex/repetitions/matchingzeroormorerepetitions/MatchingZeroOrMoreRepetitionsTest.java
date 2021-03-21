package regex.repetitions.matchingzeroormorerepetitions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingZeroOrMoreRepetitionsTest {
    
    @Test
    void check() {
        
        assertTrue(new MatchingZeroOrMoreRepetitions().check("^\\d{2,}[a-z]*[A-Z]*$"));
        
    }
}