package regex.characterclass.matchingcharacterranges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MatchingCharacterRangesTest {
    
    @Test
    void check() {
        
        assertFalse(new MatchingCharacterRanges().check("^[a-z][1-9][^a-z][^A-Z][A-Z]"));
        
    }
}