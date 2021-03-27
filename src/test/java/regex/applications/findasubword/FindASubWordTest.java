package regex.applications.findasubword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindASubWordTest {
    
    @Test
    void check() {
        
        FindASubWord findASubWord = new FindASubWord();
        
        String expected = "1\n" +
                          "2\n" +
                          "4\n";
        assertEquals(expected, findASubWord.check());
        
    }
}