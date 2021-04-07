package _java.easy.oop.javainterface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculatorTest {
    
    @Test
    void divisor_sum() {
        
        int input = 6;
        
        int expected = 12;
        
        assertEquals(expected, new MyCalculator().divisor_sum(input));
    }
}