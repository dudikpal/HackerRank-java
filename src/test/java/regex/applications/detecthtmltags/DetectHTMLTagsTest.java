package regex.applications.detecthtmltags;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectHTMLTagsTest {
    
    @Test
    void check() {
        
        assertEquals("a;div;p", new DetectHTMLTags().check("(?<=</?)\\s*\\w+"));
        
    }
}