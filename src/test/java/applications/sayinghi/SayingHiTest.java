package applications.sayinghi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SayingHiTest {
    
    @Test
    void check() {
        
        String expected = "Hi penny blankly breath accuse successfully division\n" +
                              "Hi gamble give move previously annoyed";
        
        assertEquals(expected, new SayingHi().check("^[hH][iI]\\s[a-ce-zA-CE-Z].*"));
    }
}


