package _java.easy.advanced.varargssimpleaddition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VarargsSimpleAdditionTest {
    
    @Test
    void test() {
        String input = "1\n" +
                           "2\n" +
                           "3\n" +
                           "4\n" +
                           "5\n" +
                           "6";
        
        String expected = "1+2=3\n" +
                              "1+2+3=6\n" +
                              "1+2+3+4+5=15\n" +
                              "1+2+3+4+5+6=21";
        
        assertEquals(expected, new VarargsSimpleAddition().solution(input));
    }
    
}