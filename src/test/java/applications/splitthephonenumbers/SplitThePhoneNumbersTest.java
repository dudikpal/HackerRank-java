package applications.splitthephonenumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitThePhoneNumbersTest {
    
    @Test
    void check() {
        
        String expected = "CountryCode=1,LocalAreaCode=877,Number=2638277\n" +
                              "CountryCode=91,LocalAreaCode=011,Number=23413627";
        
        assertEquals(expected, new SplitThePhoneNumbers().check("^\\d{1,3}([-\\s])\\d{1,3}\\1\\d{4,10}$"));
    }
}