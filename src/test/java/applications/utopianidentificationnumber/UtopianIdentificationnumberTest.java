package applications.utopianidentificationnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtopianIdentificationnumberTest {
    
    @Test
    void check() {
        
        String expected = "VALID\n" +
                              "INVALID";
        
        assertEquals(expected, new UtopianIdentificationnumber().check("^[a-z]{0,3}\\d{2,8}[A-Z]{3,}$"));
    }
}