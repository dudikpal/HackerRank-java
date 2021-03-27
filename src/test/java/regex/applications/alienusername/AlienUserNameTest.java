package regex.applications.alienusername;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlienUserNameTest {
    
    @Test
    void test() {
        AlienUserName alienUserName = new AlienUserName();
        
        String expected = "VALID\n" +
                              "INVALID\n" +
                              "INVALID";
        
        assertEquals(expected, alienUserName.check("^[_.]\\d+[a-zA-Z]*_?$"));
    }
    
}