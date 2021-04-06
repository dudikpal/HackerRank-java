package _java.easy.datastructures.javabitset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaBitSetTest {
    
    @Test
    void solution() {
        
        String input = "5 4\n" +
                           "AND 1 2\n" +
                           "SET 1 4\n" +
                           "FLIP 2 2\n" +
                           "OR 2 1";
        
        String expected = "0 0\n" +
                              "1 0\n" +
                              "1 1\n" +
                              "1 2";
        
        assertEquals(expected, new JavaBitSet().solution(input));
    }
}