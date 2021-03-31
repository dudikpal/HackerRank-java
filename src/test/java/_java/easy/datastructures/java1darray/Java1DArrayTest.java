package _java.easy.datastructures.java1darray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Java1DArrayTest {
    
    @Test
    void solution() {
        
        String input = "5\n" +
                           "10\n" +
                           "20\n" +
                           "30\n" +
                           "40\n" +
                           "50";
        
        String expected = "10\n" +
                              "20\n" +
                              "30\n" +
                              "40\n" +
                              "50";
        
        assertEquals(expected, new Java1DArray().solution(input));
    }
}