package regex.repetitions.matchingrepetitions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingRepetitionsTest {
    
    @Test
    void check() {
        
        assertFalse(new MatchingRepetitions().check("^[a-zA-Z02468]{40}[13579\\s]{5}$"));
        
    }
}