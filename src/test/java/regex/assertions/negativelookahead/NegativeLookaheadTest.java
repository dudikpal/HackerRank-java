package regex.assertions.negativelookahead;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NegativeLookaheadTest {
    
    @Test
    void check() {
        
        assertEquals(2, new NegativeLookahead().check("(.)(?!\\1)"));
        
    }
}