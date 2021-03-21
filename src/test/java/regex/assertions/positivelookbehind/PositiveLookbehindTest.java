package regex.assertions.positivelookbehind;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositiveLookbehindTest {
    
    @Test
    void check() {
        
        assertEquals(1, new PositiveLookbehind().check("(?<=[13579])\\d"));
        
    }
}