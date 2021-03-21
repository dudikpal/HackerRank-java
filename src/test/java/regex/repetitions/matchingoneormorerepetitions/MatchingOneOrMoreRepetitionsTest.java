package regex.repetitions.matchingoneormorerepetitions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingOneOrMoreRepetitionsTest {
    
    @Test
    void check() {
        
        assertTrue(new MatchingOneOrMoreRepetitions().check("^\\d+[A-Z]+[a-z]+$"));
        
    }
}