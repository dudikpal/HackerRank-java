package applications.validpanformat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPanFormatTest {
    
    @Test
    void check() {
        
        String expected = "YES\n" +
                              "NO\n" +
                              "NO";
        
        assertEquals(expected, new ValidPanFormat().check("^[A-Z]{5}\\d{4}[A-Z]$"));
    }
}