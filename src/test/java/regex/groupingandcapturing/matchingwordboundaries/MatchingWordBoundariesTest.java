package regex.groupingandcapturing.matchingwordboundaries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingWordBoundariesTest {
    
    @Test
    void check() {
        
        assertTrue(new MatchingWordBoundaries().check("\\b[aeiouAEIOU][a-zA-Z]*\\b"));
        
    }
}