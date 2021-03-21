package regex.repetitions.matchingxyrepetitions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingXYRepetitionsTest {
    
    @Test
    void check() {
        
        assertTrue(new MatchingXYRepetitions().check("^\\d{1,2}[a-zA-Z]{3,}\\.{0,3}$"));
        
    }
}