package regex.assertions.positivelookahead;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositiveLookaheadTest {
    
    @Test
    void check() {
        
        assertEquals(3, new PositiveLookahead().check("o(?=oo)"));
        
    }
}