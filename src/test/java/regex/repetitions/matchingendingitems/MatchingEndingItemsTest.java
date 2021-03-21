package regex.repetitions.matchingendingitems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingEndingItemsTest {
    
    @Test
    void check() {
        
        assertTrue(new MatchingEndingItems().check("^[a-zA-Z]*s$"));
        
    }
}