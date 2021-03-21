package regex.groupingandcapturing.alternativematching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlternativeMachingTest {
    
    @Test
    void check() {
        
        assertFalse(new AlternativeMaching().check("^(Mr|Mrs|Ms|Dr|Er)\\.[a-zA-Z]+$"));
        
    }
}