package regex.introduction.matchinganythingbutanewline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingAnythingButANewlineTest {
    
    @Test
    void check() {
        
        assertEquals(true, new MatchingAnythingButANewline().check("(...\\.){3}..."));
        
    }
}