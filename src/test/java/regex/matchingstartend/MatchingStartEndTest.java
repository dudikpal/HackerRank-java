package regex.matchingstartend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingStartEndTest {
    
    @Test
    void check() {
        
        assertTrue(new MatchingStartEnd().check("^\\d\\w{4}.$"));
        
    }
}