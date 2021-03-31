package _java.easy.bignumber.javaprimalitytest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaPrimalityTestTest {
    
    @Test
    void testSolution() {
        
        String input = "13";
        
        String expected = "prime";
        
        assertEquals(expected, new JavaPrimalityTest().solution(input));
    }
}