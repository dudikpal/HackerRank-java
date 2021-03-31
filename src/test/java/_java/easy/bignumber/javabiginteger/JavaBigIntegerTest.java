package _java.easy.bignumber.javabiginteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaBigIntegerTest {
    
    @Test
    void solution() {
        
        String input = "1234\n" +
                           "20";
        
        String expected = "1254\n" +
                              "24680";
        
        assertEquals(expected, new JavaBigInteger().solution(input));
    }
}