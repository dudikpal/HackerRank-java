package _java.easy.oop.exceptiohandling.exceptiohandling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptioHandlingTest {
    
    @Test
    void solution() throws Exception {
        
        String input = "3 5\n" +
                           "2 4\n" +
                           "0 0\n" +
                           "-1 -2\n" +
                           "-1 3";
        
        try {
            new ExceptioHandling().solution(input);
        } catch (Exception e) {
        
        }
    }
    
    
    @Test
    void test2() throws Exception {
        String input = "10 0\n" +
                           "0 10\n" +
                           "-1 4\n" +
                           "2 -3\n" +
                           "-2 -2\n" +
                           "5 6\n" +
                           "3 3\n" +
                           "8 0\n" +
                           "2 3\n" +
                           "3 -3";
        try {
            new ExceptioHandling().solution(input);
        } catch (Exception e) {
        
        }
    }
}