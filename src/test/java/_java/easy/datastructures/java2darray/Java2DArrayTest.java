package _java.easy.datastructures.java2darray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Java2DArrayTest {
    
    @Test
    void solution() {
        
        String input = "1 1 1 0 0 0\n" +
                           "0 1 0 0 0 0\n" +
                           "1 1 1 0 0 0\n" +
                           "0 0 2 4 4 0\n" +
                           "0 0 0 2 0 0\n" +
                           "0 0 1 2 4 0";
        
        int expected = 19;
        
        assertEquals(expected, new Java2DArray().solution(input));
    }
    
    @Test
    void testWithNegativeNumbres() {
        
        String input = "0 -4 -6 0 -7 -6\n" +
                           "-1 -2 -6 -8 -3 -1\n" +
                           "-8 -4 -2 -8 -8 -6\n" +
                           "-3 -1 -2 -5 -7 -4\n" +
                           "-3 -5 -3 -6 -6 -6\n" +
                           "-3 -6 0 -8 -6 -7";
        
        assertEquals(-19, new Java2DArray().solution(input));
    }
}