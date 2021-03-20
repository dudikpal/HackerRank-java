package regex.whitespaceandnotwhitespace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhitespaceAndNotWhitespaceTest {
    
    @Test
    void check() {
        
        assertTrue(new WhitespaceAndNotWhitespace().check("(\\S\\S\\s){2}\\S\\S"));
        
    }
}