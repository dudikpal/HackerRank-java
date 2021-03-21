package regex.assertions.negativelookbehind;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NegativeLookbehindTest {
    
    @Test
    void check() {
        
        assertEquals(3, new NegativeLookbehind().check("(?<![aeiouAEIOU])."));
        
    }
}