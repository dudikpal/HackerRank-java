package _java.easy.datastructures.javasubarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaSubArrayTest {
    
    @Test
    void negativeSubarrayCount() {
        
        String input = "5\n" +
                           "1 -2 4 -5 1";
        
        int expected = 9;
        
        assertEquals(expected, new JavaSubArray().negativeSubarrayCount(input));
    }
}