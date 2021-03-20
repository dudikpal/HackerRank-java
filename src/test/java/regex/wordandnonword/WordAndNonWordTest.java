package regex.wordandnonword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordAndNonWordTest {
    
    @Test
    void check() {
        
        assertTrue(new WordAndNonWord().check("\\w{3}\\W\\w{1,}\\W\\w{3}"));
        
    }
}