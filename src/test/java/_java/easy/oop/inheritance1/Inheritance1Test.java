package _java.easy.oop.inheritance1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Inheritance1Test {
    
    @Test
    void solution() {
        
        String expected = "I am walking\n" +
                              "I am flying\n" +
                              "I am singing";
        assertEquals(expected, new Inheritance1().solution());
    }
}