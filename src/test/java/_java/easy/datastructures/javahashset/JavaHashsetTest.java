package _java.easy.datastructures.javahashset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaHashsetTest {
    
    @Test
    void solution() {
        
        String input = "5\n" +
                           "john tom\n" +
                           "john mary\n" +
                           "john tom\n" +
                           "mary anna\n" +
                           "mary anna";
        
        String expected = "1\n" +
                              "2\n" +
                              "2\n" +
                              "3\n" +
                              "3";
        
        assertEquals(expected, new JavaHashset().solution(input));
    }
}