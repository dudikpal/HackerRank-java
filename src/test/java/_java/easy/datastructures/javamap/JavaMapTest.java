package _java.easy.datastructures.javamap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaMapTest {
    
    @Test
    void solution() {
        
        String input = "3\n" +
                           "uncle sam\n" +
                           "99912222\n" +
                           "tom\n" +
                           "11122222\n" +
                           "harry\n" +
                           "12299933\n" +
                           "uncle sam\n" +
                           "uncle tom\n" +
                           "harry";
        
        String expected = "uncle sam=99912222\n" +
                              "Not found\n" +
                              "harry=12299933";
        
        assertEquals(expected, new JavaMap().solution(input));
    }
}