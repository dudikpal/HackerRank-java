package _java.easy.oop.inheritance2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdderTest {
    
    @Test
    void add() {
        
        String expected = "My superclass is: _java.easy.oop.inheritance2.Arithmetic\n" +
                              "42 13 20";
        
        assertEquals(expected, new Inheritance2().solution());
    }
}